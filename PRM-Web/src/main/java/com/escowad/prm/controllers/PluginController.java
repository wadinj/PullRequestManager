package com.escowad.prm.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.escowad.prm.services.PluginService;
import com.escowad.prm.services.StorageService;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.escowad.prm.services.PluginService;
import com.escowad.prm.utils.ConstantUtils;

@Controller
public class PluginController {

	@Autowired
	private PluginService service;
	@Autowired
	private StorageService storageService;
	
	Logger logger = Logger.getLogger(PluginController.class);
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/plugin", method = RequestMethod.GET)
	public String plugin(HttpServletRequest request, ModelMap model,
			@SessionAttribute(required=true, name=ConstantUtils.ID_SESSION_USERGIT) GitHubClient client) {
		logger.info("Redirection vers la page plugin");
		request.getSession().setAttribute("plugins", service.getPlugins());
		return "plugins";
	}

	@RequestMapping(value =  "/plugin", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("jar") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        
        logger.info(storageService.store(service.getPluginFolder(), file));
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "/plugin";
    }

}
