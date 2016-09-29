package com.escowad.prm.services;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.escowad.prm.github.entities.pullRequest.GithubPullRequest;
import com.escowad.prm.github.entities.repository.GithubRepository;
import com.escowad.prm.utils.ConstantUtils;

public class GithubService {

	Logger logger = Logger.getLogger(GithubService.class);
	
	public String connectToGitHubFromClientId(String clientId) {
		return "secret";
	}

	/**
	 * Lance une authent avec les input utilisateur
	 * @param clientId
	 * @param codeId
	 * @throws MalformedURLException 
	 */
	public String processAuthent(String clientId, String codeId){
		RestTemplate template = new RestTemplate();
		String uri = "https://github.com/login/oauth/authorize";
		//" + ConstantUtils.ID_URL_CLI_GITHUB + "=" + clientId +
		//"&" + ConstantUtils.ID_URL_SECRET_GITHUB + "=" + codeId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		Map<String,String> urlParameters = new HashMap<String,String>();
		urlParameters.put(ConstantUtils.ID_URL_CLI_GITHUB, clientId);
		ResponseEntity<String> httpResponse = template.exchange(uri, HttpMethod.GET, request, String.class,urlParameters);
		logger.info(httpResponse.getBody());
		logger.info(httpResponse.getHeaders().getLocation().getHost());
		logger.info(httpResponse.getHeaders().getLocation().getPath());
		return httpResponse.getBody();
	}
	
	private Object launchGetHttpRequestToGithub(String contextRoot,Class<?> responseType) {
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		String uri = "https://api.github.com/" + contextRoot;
		return template.getForObject(uri, responseType);
	}

	/**
	 * List all git repository of user in parameter. Use jackson pojo in output
	 * @param username github's username
	 * @return all github repository of user
	 */
	public List<GithubRepository> listPublicRepository(String username) {
		GithubRepository[] repos = (GithubRepository[])launchGetHttpRequestToGithub("users/"+username+"/repos", GithubRepository[].class);

		return  new ArrayList(Arrays.asList(repos));
	}
	public List<GithubPullRequest> listPullRequest(String username,String projectName) {
		GithubPullRequest[] pullRequests = (GithubPullRequest[])launchGetHttpRequestToGithub("/repos/"+username+"/"+projectName+"/pulls", GithubPullRequest[].class);

		return  new ArrayList(Arrays.asList(pullRequests));
	}

}
