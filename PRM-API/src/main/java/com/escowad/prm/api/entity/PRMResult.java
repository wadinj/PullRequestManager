package com.escowad.prm.api.entity;

/**
 * Résultat de l'évaluation d'une PullRequest
 * @author escobedo
 *
 */
public class PRMResult {
	
	/**
	 * Note entre 1 et 10
	 * Cette note sera affiché à l'écran des détails du l'execution du plugin.
	 */
	private int mark;
	
	/**
	 * Résultat/Commentaire sur l'exécution du plugin
	 * Ce résultat sera affiché à l'écran des détails du l'execution du plugin.
	 */
	private String result;
	
	/**
	 * Etat du résultat : 
	 * PRMStateResult.FAILED : L'execution a échoué ou le score est insuffisant
	 * PRMStateResult.PASSED : L'execution a réussi et le score est suffisant
	 * PRMStateResult.PASSED_WITH_UPDATE : L'execution a réussi et le plugin a modifié la pull request
	 */
	private PRMStateResult state;
	
	public PRMResult(){
		this(-1, "None",PRMStateResult.NOT_YET_DEFINED);
	}
	
	public PRMResult(int mark, String result,PRMStateResult state) {
		super();
		this.mark = mark;
		this.result = result;
		this.state = state;
	}

	public int getMark() {
		return mark;
	}

	public PRMStateResult getState() {
		return state;
	}

	public void setState(PRMStateResult state) {
		this.state = state;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
