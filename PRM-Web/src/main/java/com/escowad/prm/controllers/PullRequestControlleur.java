package com.escowad.prm.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.egit.github.core.PullRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.services.MyPullRequestService;
import com.escowad.prm.services.PluginService;
import com.escowad.prm.services.TaskService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class PullRequestControlleur {
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private PluginService pluginService; 
	
	@Autowired
	private MyPullRequestService prService;
	
	@RequestMapping(value = "/pullRequest", method = RequestMethod.GET)
	public String login(HttpServletRequest request,
						@RequestParam("id") long id,
						@SessionAttribute(name=ConstantUtils.ID_SESSION_PULLREQUESTS,required=true) List<PullRequest> prs,
						@SessionAttribute(name=ConstantUtils.ID_SESSION_PLUGIN_RESULT,required=false) Map<Long, Map<IPRM,PRMResult>> results,
						ModelMap model) {
		Map<IPRM,PRMResult> mapResult = results.get(id);
		request.setAttribute("PRMRESULT", mapResult);
		pluginService.evaluatePluginOnPullRequest(results, prService.getPullRequestFromId(prs, id));
		return "pullRequestDetails";
	}

	
}
