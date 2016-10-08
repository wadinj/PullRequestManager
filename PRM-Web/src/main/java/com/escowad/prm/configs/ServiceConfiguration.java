package com.escowad.prm.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.escowad.prm.services.AuthorizationService;
import com.escowad.prm.services.GithubService;
import com.escowad.prm.services.MyPullRequestService;
import com.escowad.prm.services.PluginService;
import com.escowad.prm.services.StorageService;
import com.escowad.prm.services.TaskService;

@Configuration
public class ServiceConfiguration {

	@Bean
	public GithubService githubService() {
		return new GithubService();
	}
	@Bean
	public AuthorizationService authorizationService() {
		return new AuthorizationService();
	}
	@Bean
	public PluginService pluginService() {
		return new PluginService();
	}
	
	@Bean
	public StorageService storageService(){
		return new StorageService();
	}
	@Bean
	public MyPullRequestService prService() {
		return new MyPullRequestService();
	}
	@Bean
	public TaskService taskService(){
		return new TaskService();
	}
}

