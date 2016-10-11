package com.escowad.prm.services;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.eclipse.egit.github.core.PullRequest;
import org.springframework.beans.factory.annotation.Autowired;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.utils.ConstantUtils;

public class PluginService {

	@Autowired
	private HttpSession session;

	private Map<Long, Map<IPRM,PRMResult>> plugins;
	private Logger logger = Logger.getLogger(PluginService.class);

	public int nombrePlugins(){
		for(Map<IPRM,PRMResult> value : plugins.values()) {
			return value.size();
		}
		return 0;
	}

	public Map<Long, Map<IPRM,PRMResult>> getPlugins(){
		return this.plugins;
	}

	public Map<Long, Map<IPRM,PRMResult>> initSession(List<PullRequest> prs) {
		Map<Long, Map<IPRM,PRMResult>> map = new HashMap<Long, Map<IPRM,PRMResult>>();
		for(PullRequest tmp : prs) {
			map.put(tmp.getId(), new HashMap<IPRM,PRMResult>());
		}
		return map;
	}
	public void addPlugin(IPRM plugin){
		plugins = (Map<Long, Map<IPRM,PRMResult>>) session.getAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT);
		boolean alreadyPresent = false;
		Map<IPRM,PRMResult> mapPluginTmp;
		for(Entry<Long,Map<IPRM,PRMResult>> pullRequest : plugins.entrySet()) {
			mapPluginTmp = pullRequest.getValue();
			for(Entry<IPRM,PRMResult> pluginList : pullRequest.getValue().entrySet()) {
				if(pluginList.getKey().getPluginName().equals(plugin.getPluginName())) {
					logger.info("PLUGIN DEJA PRESENT..");
					alreadyPresent = true;
				}
			}
			if(!alreadyPresent) {
				mapPluginTmp.put(plugin, null);
				plugins.put(pullRequest.getKey(),mapPluginTmp);
			}
			alreadyPresent = false;
		}
		session.setAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT, plugins);
		session.setAttribute(ConstantUtils.ID_SESSION_PLUGIN_NB, (int)session.getAttribute(ConstantUtils.ID_SESSION_PLUGIN_NB)+1);
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
			List<File> jarFiles = new ArrayList<File>();
			for(int i = 0; i < files.length; i++){
				jarFiles.add(files[i]);
			}

			plugins.clear();
			for(File jar : jarFiles){
				IPRM p = loadPRMPluginFromJarFile(jar);
				addPlugin(p);
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
					URLClassLoader sysLoader = new URLClassLoader(new URL[]{base.toURI().toURL()},getClass().getClassLoader());
					try {
						String className = jarEntry.getName().substring(0, jarEntry.getName().length()-6).replace('/', '.');
						Class c = Class.forName (className, true, sysLoader);	                
						if(isIPRMClass(c)){
							logger.info("Classe implémentant IPRM trouvé");
							Object instanceLoaded = c.newInstance();
							return (IPRM)instanceLoaded;
						}
					} catch (ClassNotFoundException e1) {
						System.out.println("Impossible de charger la classe : " + e1.getMessage());
					} catch (InstantiationException e1) {
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
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
		return ConstantUtils.PLUGIN_FOLDER;
	}
	/**
	 * 
	 * @param results The current map of results in session
	 * @param pr the pull request to process
	 * @return
	 */
	public void evaluatePluginOnPullRequest(Map<Long, Map<IPRM,PRMResult>> results,PullRequest pr) {
		Map<Long, Map<IPRM,PRMResult>> returned = results;
		Map<IPRM,PRMResult> tmp = returned.get(pr.getId());
		for(Entry<IPRM,PRMResult> plugResult : tmp.entrySet()) {
			if(plugResult.getValue() == null) {
				tmp.put(plugResult.getKey(), plugResult.getKey().evaluate(pr));
			}
		}
		returned.put(pr.getId(), tmp);
		session.setAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT, returned);
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

	public int getEvaluationForPullRequest(PullRequest pr) {
		if(session.getAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT) != null) {
		plugins = (Map<Long, Map<IPRM,PRMResult>>) session.getAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT);
			int average = 0;
			int nb = 0;
			Map<IPRM, PRMResult> map = plugins.get(pr.getId());
			for(Entry<IPRM, PRMResult> entry : map.entrySet()) {
				if(entry.getValue() != null) {
					average += entry.getValue().getMark();
					nb ++;
				}
			}
			if(nb == 0) {
				return -1;
			}
			return (average / nb);
		}
		return -1;
	}
}