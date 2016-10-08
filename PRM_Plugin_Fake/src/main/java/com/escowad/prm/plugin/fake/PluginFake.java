package com.escowad.prm.plugin.fake;

import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.api.entity.PRMStateResult;

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
	public PRMResult evaluate(PullRequest pullRequest) {
		return new PRMResult(61, "Test réussi", PRMStateResult.PASSED);
	}
	
	@Override
	public PullRequest executeTreatment(PullRequest pullRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
