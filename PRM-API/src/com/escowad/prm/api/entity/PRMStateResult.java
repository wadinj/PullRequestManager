package com.escowad.prm.api.entity;
/**
 * State of the result of the plugin execution for the given pull request in PRMResult
 * @author jo
 *
 */
public enum PRMStateResult {
	/**
	 * Your plugin passed all your check with any update on the pull request
	 */
	PASSED,
	/**
	 * Your plugin fail on it check or it update. You could add more explanation on string result 
	 */
	FAILED,
	/**
	 * Your plugin failed at your check and it update the pull request to pass these checks
	 */
	PASSED_WITH_UPDATE,
	/**
	 * You plugin didn't finish his own execution
	 */
	NOT_YET_DEFINED
}
