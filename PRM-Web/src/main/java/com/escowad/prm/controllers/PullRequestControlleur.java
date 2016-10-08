package com.escowad.prm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.escowad.prm.services.TaskService;

@Controller
public class PullRequestControlleur {
	
	@Autowired
	private TaskService taskService;
	
	
}
