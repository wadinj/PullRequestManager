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

	@RequestMapping(value = "/loginOAuth", method = RequestMethod.GET)
	public String loginOAuth(HttpServletRequest request, 
			@CookieValue(value = "clientId",defaultValue="") String clientId,
			ModelMap model) {
		if(clientId.isEmpty()) {
			logger.info("Pas de cookie client ID, redirection vers la mire de login");
			return "loginOAuth";
		} else {
			// On place l'ID client dans la Session et on envoie vers le dashboard
			request.getSession().setAttribute(ConstantUtils.ID_SESSION_CLI_GITHUB, clientId);
			return "dashboard";
		}

	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/callBackGit", method = RequestMethod.GET)
	public String callBackGit(HttpServletRequest request, 
			ModelMap model) {
		// On recupère le code de github
		request.getSession().setAttribute(ConstantUtils.ID_CODE_FROM_GITHUB,request.getParameter("code"));
		return "dashboard";
	}
	@RequestMapping(value= "/authentGit", method = RequestMethod.GET)
	public String authentGit(HttpServletRequest request, 
			ModelMap model) {
		String clientId = request.getParameter("client_id");
		String secretId = request.getParameter("secret_id");
		// On set dans la session les deux values de connexion
		request.getSession().setAttribute(ConstantUtils.ID_SESSION_CLI_GITHUB, clientId);
		request.getSession().setAttribute(ConstantUtils.ID_SESSION_SECRET_GITHUB, secretId);
		// Pour authent il faut renvoyer le lien github
		return "dashboard";
	}
}
