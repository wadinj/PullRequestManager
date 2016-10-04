package com.escowad.prm.plugin.fake;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;

public class PluginFake implements IPRM{

	@Override
	public String getPluginName() {
		return "Fake test plugin";
	}

	@Override
	public String getPluginVersion() {
		return "1.0";
	}
	@Override
	public PRMResult evaluate(GithubPullRequest pullRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GithubPullRequest executeTreatment(GithubPullRequest pullRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
