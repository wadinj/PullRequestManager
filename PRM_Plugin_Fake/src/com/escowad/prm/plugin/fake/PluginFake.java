package com.escowad.prm.plugin.fake;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMModifiedPullRequest;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.api.entity.PRMSource;

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
	public PRMResult evaluate(PRMSource pullRequest) {
		return null;
	}

	@Override
	public boolean executable() {
		return false;
	}

	@Override
	public PRMModifiedPullRequest executeTreatment(PRMSource pullRequest) {
		return null;
	}

	
}
