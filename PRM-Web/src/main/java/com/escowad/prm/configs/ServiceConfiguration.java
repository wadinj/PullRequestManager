package com.escowad.prm.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.escowad.prm.services.GithubService;

@Configuration
public class ServiceConfiguration {

	@Bean
	public GithubService githubService() {
		return new GithubService();
	}
}
