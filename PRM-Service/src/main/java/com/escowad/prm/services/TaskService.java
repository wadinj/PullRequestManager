package com.escowad.prm.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.plugin.entities.PluginTask;
import com.escowad.prm.plugin.entities.TaskState;

public class TaskService {

	Map<Long, List<PluginTask>> tasks;
	
	public TaskService(){
		tasks = new HashMap<Long, List<PluginTask>>();
	}
	
	public List<PluginTask> getPRPluginTasks(PullRequest pr){
		return tasks.get(pr.getId());
	}
	
	public void createTask(PullRequest pr, IPRM plugin){
		PluginTask task = new PluginTask(pr.getId(), TaskState.INITIALIZED, plugin);
		
		List<PluginTask> prTasks = new ArrayList<PluginTask>();
		if(tasks.containsKey(pr.getId())){
			prTasks = tasks.get(pr.getId());
		}
		
		prTasks.add(task);
		tasks.put(pr.getId(), prTasks);
	}
}
