package com.escowad.prm.api.entity;

import org.eclipse.egit.github.core.PullRequest;


/**
 * @author escobedo, wadin
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
	public PRMResult evaluate(PullRequest pullRequest);
	
	/**
	 * Execute un traitement spécifique sur la PullRequest
	 * @param pullRequest
	 * @return null si le plugin exécute aucun traitement. Sinon, il renvoit l'objet PullRequest modifié.
	 * The GithubPullRequest updated else
	 */
	public PullRequest executeTreatment(PullRequest pullRequest);
}
