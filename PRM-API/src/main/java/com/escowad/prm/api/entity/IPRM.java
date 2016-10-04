package com.escowad.prm.api.entity;

import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;

/**
 * @author escobedo
 *
 */
public interface IPRM {
	
	/**
	 * Retourne le nom du plugin
	 * @return
	 */
	public String getPluginName();
	
	/**
	 * Retourne la version du plugin
	 * @return
	 */
	public String getPluginVersion();
	
	/**
	 * Fonction principale à implémenter : retourne une évaluation de la Pull Request
	 * @param pullRequest
	 * @return
	 */
	public PRMResult evaluate(GithubPullRequest pullRequest);
	
	/**
	 * Execute un traitement spécifique sur la PullRequest
	 * @param pullRequest
	 * @return null if your plugin didn't execute a treatment (modification on pull request)
	 * The GithubPullRequest updated else
	 */
	public GithubPullRequest executeTreatment(GithubPullRequest pullRequest);
}
