package com.escowad.prm.services;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import com.escowad.prm.api.entity.IPRM;

public class PluginService {
	
	private String PLUGIN_FOLDER = "plugins";
	private List<IPRM> plugins = new ArrayList<IPRM>();
	
	public int nombrePlugins(){
		return plugins.size();
	}
	
	public List<IPRM> getPlugins(){
		return this.plugins;
	}
	
	public void addPlugin(IPRM plugin){
		if(!plugins.contains(plugin)) plugins.add(plugin);
	}

	public void updatePluginLibrary(){
		
		try{
			
			File pluginDirectory = new File(PLUGIN_FOLDER);
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
			List<File> jarFiles = new ArrayList<File>();
			for(int i = 0; i < files.length; i++){
				jarFiles.add(files[i]);
			}
			
			plugins.clear();
			for(File jar : jarFiles){
				IPRM p = loadPRMPluginFromJarFile(jar);
				plugins.add(p);
			}
			
		} catch (Exception e){
			
		}
	}
	
	public IPRM loadPRMPluginFromJarFile(File base){
		IPRM plugin = null;
		JarFile jarFile;
		try {
			jarFile = new JarFile(base);
		
			Enumeration<JarEntry> e = jarFile.entries();
	        JarEntry jarEntry;
	
	        while (e.hasMoreElements()) {
	            jarEntry = e.nextElement();
	            if (jarEntry == null) {
	                break;
	            }
	            if (jarEntry.getName().endsWith(".class")) {
	                System.out.println("Found " + jarEntry.getName().replaceAll("/", "\\."));
	                
	                //URLClassLoader sysLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
	                URLClassLoader sysLoader = new URLClassLoader(new URL[]{base.toURI().toURL()});
	                try {
	                	String className = jarEntry.getName().substring(0, jarEntry.getName().length()-6).replace('/', '.');
	                	Class<?> c = sysLoader.loadClass(className);
						if(isIPRMClass(c)){
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
		} catch (IOException e2) {
			
		}
		
		return plugin;
	}
	
	private boolean isIPRMClass(Class<?> c){
		return (IPRM.class.isAssignableFrom(c));
	}
	
	public String getPluginFolder(){
		return this.PLUGIN_FOLDER;
	}
}
