package com.escowad.prm.plugin.entities;

import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;

public class PluginTask {
	private long pullRequestID;
	
	private TaskState state;
	
	private IPRM plugin;
	
	private PRMResult evalResult;
	
	private PullRequest prResult;

	public PluginTask(long pullRequestID, TaskState state, IPRM plugin) {
		super();
		this.pullRequestID = pullRequestID;
		this.state = state;
		this.plugin = plugin;
	}

	public final long getPullRequestID() {
		return pullRequestID;
	}

	public final void setPullRequestID(long pullRequestID) {
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

	public final PullRequest getPrResult() {
		return prResult;
	}

	public final void setPrResult(PullRequest prResult) {
		this.prResult = prResult;
	}
	
}
