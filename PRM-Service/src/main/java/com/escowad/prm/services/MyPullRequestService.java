package com.escowad.prm.services;

import java.util.List;

import org.eclipse.egit.github.core.PullRequest;

public class MyPullRequestService {

	public PullRequest getPullRequestFromId(List<PullRequest> listPr,long id) {
		for(PullRequest pr : listPr) {
			if(pr.getId() == id) {
				return pr;
			}
		}
		return null;
	}
}
