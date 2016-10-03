package com.escowad.prm.api.entity;

/**
 * Résultat de l'évaluation d'une PullRequest
 * @author escobedo
 *
 */
public class PRMResult {
	
	/**
	 * Note comprise entre 0 et 100
	 */
	private int mark;
	
	/**
	 * Commentaire résultant de l'évaluation du plugin
	 */
	private String result;
	
	public PRMResult(){
		this(-1, "None");
	}
	
	public PRMResult(int mark, String result) {
		super();
		this.mark = mark;
		this.result = result;
	}

	public int getMark() {
		return mark;
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
