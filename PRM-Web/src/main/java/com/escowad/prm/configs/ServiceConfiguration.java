package com.escowad.prm.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.escowad.prm.services.AuthorizationService;
import com.escowad.prm.services.GithubService;

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
}
