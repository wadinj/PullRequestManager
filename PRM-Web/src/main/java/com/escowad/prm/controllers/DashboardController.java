package com.escowad.prm.controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.PullRequestService;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.services.AuthorizationService;
import com.escowad.prm.services.GithubService;
import com.escowad.prm.services.PluginService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class DashboardController {

	@Autowired
	private GithubService githubService;
	@Autowired
	private PluginService pluginService;
	
	Logger logger = Logger.getLogger(DashboardController.class);
	@Autowired
	private HttpServletRequest context;
	@Autowired
	private AuthorizationService authorization;

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(HttpServletRequest request,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERGIT) GitHubClient client,
			@SessionAttribute(required=false, name=ConstantUtils.ID_SESSION_PULLREQUESTS) List<PullRequest> listPr,
			@SessionAttribute(required=false, name=ConstantUtils.ID_SESSION_REPOS) List<Repository> repos,
			@SessionAttribute(required=false, name=ConstantUtils.ID_SESSION_PLUGIN_RESULT) Map<Long, Map<IPRM,PRMResult>> results,
			ModelMap model) {
		if(client != null) {
			logger.info("Redirection vers l'index dashboard");
			RepositoryService service = new RepositoryService(client);
			try {
				if(repos == null) {
					repos = service.getRepositories();
					request.getSession().setAttribute(ConstantUtils.ID_SESSION_REPOS,repos);
					
				}
			} catch (IOException e) {
				logger.info("Impossible de lister les repositories, authent fausse, redirection login");
				return "redirect:/login";
			}
			if(listPr == null) {
				List<PullRequest> prs = githubService.getAllPullRequestFromAllProject(client, repos);
				request.getSession().setAttribute(ConstantUtils.ID_SESSION_PLUGIN_RESULT,pluginService.initSession(prs));
				request.getSession().setAttribute(ConstantUtils.ID_SESSION_PULLREQUESTS, prs);
				request.getSession().setAttribute(ConstantUtils.ID_SESSION_PLUGIN_NB, 0);
			}
			Map<Long, Integer> mapAverage = new HashMap<Long, Integer>();
			for(PullRequest pr : (List<PullRequest>)request.getSession().getAttribute(ConstantUtils.ID_SESSION_PULLREQUESTS)) {
				mapAverage.put(pr.getId(), pluginService.getEvaluationForPullRequest(pr));
			}
			request.setAttribute(ConstantUtils.ID_REQUEST_AVERAGE, mapAverage);
			request.getSession().setAttribute(ConstantUtils.ALL_PLUGINS, pluginService.getPlugins());
			return "dashboard";
		} else {
			logger.info("Redirection vers la page de login, dashboard sans session");
			return "login";
		}
	}
	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public ModelAndView showDetails(ModelMap model,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERGIT) GitHubClient client,
			@RequestParam(required=true, name="name") String projectName,
			HttpSession session,
			HttpServletRequest request){
		logger.info("Redirection vers le détail d'un projet");
		PullRequestService service = new PullRequestService(client);
		RepositoryId repo = new RepositoryId(client.getUser(), projectName);
		ModelAndView mv = new ModelAndView("projectDetails");
		try {
			List<PullRequest> prs = service.getPullRequests(repo, null);
			logger.info("La taille de pull request : " + prs.size());
			mv.addObject("pullRequests",prs);
			Map<Long, Integer> mapAverage = new HashMap<Long, Integer>();
			for(PullRequest pr : prs) {
				mapAverage.put(pr.getId(), pluginService.getEvaluationForPullRequest(pr));
			}
			request.setAttribute(ConstantUtils.ID_REQUEST_AVERAGE, mapAverage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mv;
	}
}
