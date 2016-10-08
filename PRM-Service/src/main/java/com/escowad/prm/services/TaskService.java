package com.escowad.prm.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;
import com.escowad.prm.plugin.entities.PluginTask;
import com.escowad.prm.plugin.entities.TaskState;

public class TaskService {

	Map<Integer, List<PluginTask>> tasks;
	
	public TaskService(){
		tasks = new HashMap<Integer, List<PluginTask>>();
	}
	
	public List<PluginTask> getPRPluginTasks(GithubPullRequest pr){
		return tasks.get(pr.getId());
	}
	
	public void createTask(GithubPullRequest pr, IPRM plugin){
		PluginTask task = new PluginTask(pr.getId(), TaskState.INITIALIZED, plugin);
		
		List<PluginTask> prTasks = new ArrayList<PluginTask>();
		if(tasks.containsKey(pr.getId())){
			prTasks = tasks.get(pr.getId());
		}
		
		prTasks.add(task);
		tasks.put(pr.getId(), prTasks);
	}
}
