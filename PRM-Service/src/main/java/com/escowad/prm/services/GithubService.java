package com.escowad.prm.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.PullRequestService;

public class GithubService {

	Logger logger = Logger.getLogger(GithubService.class);
	
	public List<PullRequest> getAllPullRequestFromAllProject(GitHubClient user, List<Repository> repos) {
		PullRequestService prService = new PullRequestService(user);
		RepositoryId repoId;
		List<PullRequest> allPrList = new ArrayList<PullRequest>();		
		for(int i = 0 ; i < repos.size() ; i ++) {
			repoId = new RepositoryId(user.getUser(), repos.get(i).getName());
			try {
				allPrList.addAll(prService.getPullRequests(repoId, null));
			} catch (IOException e) {
				logger.error("Pas de pull request pour ce repository");
				logger.error("Passage au suivant..");
			}
		}
		logger.info("Pull request trouvé : " + allPrList.size());
		return allPrList;
	}
}
