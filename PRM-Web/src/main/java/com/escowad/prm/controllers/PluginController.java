package com.escowad.prm.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.escowad.prm.services.PluginServices;

@Controller
public class PluginController {

	@Autowired
	private PluginServices service;
	Logger logger = Logger.getLogger(PluginController.class);
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/plugin", method = RequestMethod.GET)
	public String plugin(HttpServletRequest request, ModelMap model) {
		logger.info("Redirection vers la page plugin");
		if(request.getSession().getAttribute("username") != null) {
			request.getSession().setAttribute("plugins", service.getPlugins());
			return "plugin";
		} else {
			return "login";
		}
	}
}
