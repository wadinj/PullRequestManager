package com.escowad.prm.services;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.utils.ConstantUtils;

public class PluginService {
	
	private List<IPRM> plugins = new ArrayList<IPRM>();
	
	public int nombrePlugins(){
		return plugins.size();
	}
	
	public List<IPRM> getPlugins(){
		return this.plugins;
	}
	
	public void addPlugin(IPRM plugin){
		plugins.add(plugin);
	}

	public void updatePluginLibrary(){
		
		try{
			
			File pluginDirectory = new File(ConstantUtils.PLUGIN_FOLDER);
			if(!pluginDirectory.exists()) pluginDirectory.mkdir();
			
			FilenameFilter jarFilter = new FilenameFilter() {
				public boolean accept(File dir, String name) {
					String lowercaseName = name.toLowerCase();
					if (lowercaseName.endsWith(".jar")) {
						return true;
					} else {
						return false;
					}
				}
			};
			
			File[] files = pluginDirectory.listFiles(jarFilter);
			List<JarFile> jarFiles = new ArrayList<JarFile>();
			for(int i = 0; i < files.length; i++){
				jarFiles.add(new JarFile(files[i]));
			}
			
			plugins.clear();
			for(JarFile jar : jarFiles){
				IPRM p = loadPRMPluginFromJarFile(jar);
				plugins.add(p);
			}
			
		} catch (Exception e){
			
		}
	}
	
	public IPRM loadPRMPluginFromJarFile(JarFile jarFile){
		IPRM plugin = null;
		
		Enumeration<JarEntry> e = jarFile.entries();
        JarEntry jarEntry;

        while (e.hasMoreElements()) {
            jarEntry = e.nextElement();
            if (jarEntry == null) {
                break;
            }
            if (jarEntry.getName().endsWith(".class")) {
                System.out.println("Found " + jarEntry.getName().replaceAll("/", "\\."));
                
                URLClassLoader sysLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
                try {
                	Class<?> c = sysLoader.loadClass(jarEntry.getName());
					if(isIPRMClass(sysLoader.loadClass(jarEntry.getName()))){
						plugin = (IPRM) c.newInstance();
					}
				} catch (ClassNotFoundException e1) {
					System.out.println("Impossible de charger la classe : " + e1.getMessage());
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        }
		
		return plugin;
	}
	
	private boolean isIPRMClass(Class<?> c){
		return (IPRM.class.isAssignableFrom(c));
	}
	
	public String getPluginFolder(){
		return ConstantUtils.PLUGIN_FOLDER;
	}
	/**
	 * 
	 * @param results The current map of results in session
	 * @param pr the pull request to process
	 * @return
	 */
	public Map<Long, Map<IPRM,PRMResult>> evaluatePluginOnPullRequest(Map<Long, Map<IPRM,PRMResult>> results,PullRequest pr) {
		Map<Long, Map<IPRM,PRMResult>> returned = results;
		Map<IPRM,PRMResult> tmp = returned.get(pr.getId());
		for(Entry<IPRM,PRMResult> plugResult : tmp.entrySet()) {
				 if(plugResult.getValue() == null) {
					 tmp.put(plugResult.getKey(), plugResult.getKey().evaluate(pr));
				 }
			 }
		returned.put(pr.getId(), tmp);
		return returned;
	}

	/**
	 * 
	 * @param results The current map of results in session
	 * @param pr the pull request to process
	 * @param plugins the list of plugins added in session
	 * @return
	 */
	public PullRequest executePluginOnPullRequest(PullRequest pr,List<IPRM> plugins) {
		PullRequest returnRequest = pr;
		for(IPRM plugin : plugins) {
			returnRequest = plugin.executeTreatment(pr);
		}
		return returnRequest;
	}
	
}
