package com.escowad.prm.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;
import com.escowad.prm.github.entities.repository.GithubRepository;
import com.escowad.prm.services.AuthorizationService;
import com.escowad.prm.services.GithubService;
import com.escowad.prm.services.PluginService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class DashboardController {

	@Autowired
	private GithubService githubService;
	private PluginService pluginService;
	
	Logger logger = Logger.getLogger(DashboardController.class);
	@Autowired
	private HttpServletRequest context;
	@Autowired
	private AuthorizationService authorization;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(HttpServletRequest request, ModelMap model) {
		logger.info("Redirection vers l'index dashboard");
		String username = request.getParameter("username");
		if(authorization.checkAuthentification(request)) {
			List<GithubRepository> repos = githubService.listPublicRepository(username);
			if(username != null) {
				request.getSession().setAttribute(ConstantUtils.ID_SESSION_USERNAME,username);
				request.getSession().setAttribute(ConstantUtils.ID_SESSION_GITHUB_PROJECTS,repos);
				//request.getSession().setAttribute("pluginNumber", pluginService.nombrePlugins());
			}
			logger.info("Nom d'utilisateur présent, authentification OK");
			return "dashboard";
		} else {
			return "login";
		}
	}
	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public ModelAndView showDetails(ModelMap model,
			 				  @SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERNAME) String username,
			 				  @RequestParam(required=true, name="name") String projectName,
			 				  HttpSession session){
		logger.info("Redirection vers le détail d'un projet");
		List<GithubPullRequest> pullRequests = githubService.listPullRequest(username, projectName);
		ModelAndView mv = new ModelAndView("projectDetails");
		mv.addObject("pullRequests",pullRequests);
		return mv;
	}
}
