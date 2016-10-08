package com.escowad.prm.plugin.entities;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;

public class PluginTask {
	private Integer pullRequestID;
	
	private TaskState state;
	
	private IPRM plugin;
	
	private PRMResult evalResult;
	
	private GithubPullRequest prResult;

	public PluginTask(Integer pullRequestID, TaskState state, IPRM plugin) {
		super();
		this.pullRequestID = pullRequestID;
		this.state = state;
		this.plugin = plugin;
	}

	public final Integer getPullRequestID() {
		return pullRequestID;
	}

	public final void setPullRequestID(Integer pullRequestID) {
		this.pullRequestID = pullRequestID;
	}

	public final TaskState getState() {
		return state;
	}

	public final void setState(TaskState state) {
		this.state = state;
	}

	public final IPRM getPlugin() {
		return plugin;
	}

	public final void setPlugin(IPRM plugin) {
		this.plugin = plugin;
	}

	public final PRMResult getEvalResult() {
		return evalResult;
	}

	public final void setEvalResult(PRMResult evalResult) {
		this.evalResult = evalResult;
	}

	public final GithubPullRequest getPrResult() {
		return prResult;
	}

	public final void setPrResult(GithubPullRequest prResult) {
		this.prResult = prResult;
	}
	
}
