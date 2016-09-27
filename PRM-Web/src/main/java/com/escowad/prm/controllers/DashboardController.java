package com.escowad.prm.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	Logger logger = Logger.getLogger(DashboardController.class);
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(ModelMap model) {
		logger.info("Redirection vers l'index dashboard");
		
		
		/**
		 * Chargement des détails de l'utilisateur (projets, etc)
		 */
		
		/**
		 * Projects
		 */
		List<String> projects = new ArrayList<String>();
		
		projects.add("Projet 1");
		projects.add("Projet 2");
		projects.add("Projet 3");
	
		context.getSession().setAttribute("PROJECTS", projects);
		
		return "dashboard";
	}
	
	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public String showDetails(ModelMap model){
		logger.info("Redirection vers le détail d'un projet");
		return "dashboard";
	}
}
