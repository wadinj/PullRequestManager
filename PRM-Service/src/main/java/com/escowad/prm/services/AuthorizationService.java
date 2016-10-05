package com.escowad.prm.services;

import javax.servlet.http.HttpServletRequest;

import com.escowad.prm.utils.ConstantUtils;

public class AuthorizationService {

	/**
	 * Verify the presence of authentification
	 * The user must pass by the login page
	 * @return
	 */
	public boolean checkAuthentification(HttpServletRequest request) {
//		String username = request.getParameter("username");
//		if(username != null || request.getSession().getAttribute(ConstantUtils.ID_SESSION_USERNAME) != null) {
//			return true;
//		}
		return false;
	}
}
