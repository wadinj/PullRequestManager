package com.escowad.prm.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.escowad.prm.github.entities.repository.GithubRepository;
import com.escowad.prm.services.GithubService;

@Controller
public class DashboardController {

	@Autowired
	private GithubService service;
	Logger logger = Logger.getLogger(DashboardController.class);
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(HttpServletRequest request, ModelMap model) {
		logger.info("Redirection vers l'index dashboard");
		String username = request.getParameter("username");
		if(username != null) {
			List<GithubRepository> repos = service.listPublicRepository(username);
			request.getSession().setAttribute("username",username);
			request.getSession().setAttribute("githubProject",repos);
			logger.info("Nom d'utilisateur présent, authentification OK");
			return "dashboard";
		} else {
			return "login";
		}
	}
	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public String showDetails(ModelMap model){
		logger.info("Redirection vers le détail d'un projet");
		return "dashboard";
	}
}
