package com.escowad.prm.plugin.fake;

import java.util.Random;

import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.api.entity.PRMStateResult;

public class PluginFake implements IPRM{

	public PluginFake() {
		super();
	}
	@Override
	public String getPluginName() {
		return "PRM Random plugin n°1";
	}

	@Override
	public String getPluginVersion() {
		return "1.0";
	}
	@Override
	public PRMResult evaluate(PullRequest pullRequest) {
		Random r = new Random();
		int rand = r.nextInt(10);
		return new PRMResult(rand, "Le plugin random 1 vous a attribué une note de : " + rand + "/10", rand < 5 ? PRMStateResult.FAILED :  PRMStateResult.PASSED);
	}
	
	@Override
	public PullRequest executeTreatment(PullRequest pullRequest) {
		return null;
	}

	
}
