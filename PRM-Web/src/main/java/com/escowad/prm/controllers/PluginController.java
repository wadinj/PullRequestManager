package com.escowad.prm.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.services.PluginService;
import com.escowad.prm.services.StorageService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class PluginController {

	@Autowired
	private PluginService service;
	@Autowired
	private StorageService storageService;
	@Autowired
	private PluginService pluginService;
	
	Logger logger = Logger.getLogger(PluginController.class);
	@Autowired
	private HttpServletRequest context;

	@RequestMapping(value = "/plugin", method = RequestMethod.GET)
	public String plugin(HttpServletRequest request, ModelMap model,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERGIT) GitHubClient client,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_REPOS) List<Repository> repos) {
		logger.info("Redirection vers la page plugin");
		request.getSession().setAttribute(ConstantUtils.ALL_PLUGINS, service.getPlugins());
		return "plugins";
	}

	@RequestMapping(value =  "/plugin", method = RequestMethod.POST)
	public String handleFileUpload(@RequestParam("file") MultipartFile file,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_PLUGIN_RESULT) Map<Long, Map<IPRM,PRMResult>> map,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERGIT) GitHubClient client,
			@SessionAttribute(required=false, name=ConstantUtils.ID_SESSION_PULLREQUESTS) List<PullRequest> listPr,
			@SessionAttribute(required=false, name=ConstantUtils.ID_SESSION_REPOS) List<Repository> repos,
			RedirectAttributes redirectAttributes) throws IOException {
		logger.info("Filename : "+ file.getOriginalFilename());
		String filePath = storageService.store(service.getPluginFolder(), file);
		redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
		IPRM plugin = service.loadPRMPluginFromJarFile(new File(filePath));
		pluginService.addPlugin(plugin);
		for(PullRequest pr : listPr) {
			// ON LANCE LE PLUGIN
			pluginService.evaluatePluginOnPullRequest(map, pr);
		}
		return "plugins";
	}

}
