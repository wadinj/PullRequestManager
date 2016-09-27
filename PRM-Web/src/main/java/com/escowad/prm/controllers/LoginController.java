package com.escowad.prm.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.escowad.prm.services.GithubService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class LoginController {

	Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	private HttpServletRequest context;
	@Autowired
	private GithubService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, 
			@CookieValue(value = "clientId",defaultValue="") String clientId,
			ModelMap model) {
		if(clientId.isEmpty()) {
			logger.info("Pas de cookie client ID, redirection vers la mire de login");
			return "login";
		} else {
			// On place l'ID client dans la Session et on envoie vers le dashboard
			request.getSession().setAttribute(ConstantUtils.ID_SESSION_CLI_GITHUB, service.connectToGitHubFromClientId(clientId));
			return "dashboard";
		}

	}
	@RequestMapping(value = "/callBackGit", method = RequestMethod.GET)
	public String login(HttpServletRequest request, 
			ModelMap model) {
		request.getSession().setAttribute(ConstantUtils.ID_SESSION_SECRET_GITHUB,request.getParameter("code"));
		return "dashboard";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, ModelMap model) {
		
		//Clean cookies
		
		request.getSession().invalidate();
		
		return "login";
	}
}
