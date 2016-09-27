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

import com.escowad.prm.services.GithubService;

@Controller
public class DashboardController {

	@Autowired
	private GithubService service;
	Logger logger = Logger.getLogger(DashboardController.class);
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, ModelMap model) {
		logger.info("Redirection vers l'index dashboard");
		String username = request.getParameter("username");
		if(username != null) {
			request.getSession().setAttribute("username",username);
			logger.info("Nom d'utilisateur présent, authentification OK");
			List<String> projects = service.getAllProjectName(username);
			ModelAndView view = new ModelAndView("dashboard");
			view.addObject("projectList",projects);
			return view;
		} else {
			return new ModelAndView("login",null);
		}
	}
}
