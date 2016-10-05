package com.escowad.prm.api.entity;

/**
 * Résultat de l'évaluation d'une PullRequest
 * @author escobedo
 *
 */
public class PRMResult {
	
	/**
	 * Mark between 0 and 100
	 * This mark will be displayed in the front interface and the users could see it.
	 */
	private int mark;
	
	/**
	 * Result/Comment of the plugin execution
	 * This line will be displayed in the front interface and the users could see it.
	 */
	private String result;
	
	/**
	 * The state after the execution
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
