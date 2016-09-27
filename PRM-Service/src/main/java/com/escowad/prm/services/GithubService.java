package com.escowad.prm.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.escowad.prm.entities.GithubRepository;
import com.escowad.prm.utils.ConstantUtils;
import com.escowad.prm.utils.JSonUtils;

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
	
	private String launchHttpRequestToGithub(String contextRoot, HttpMethod requestType) {
		RestTemplate template = new RestTemplate();
		String uri = "https://api.github.com/" + contextRoot;
		//" + ConstantUtils.ID_URL_CLI_GITHUB + "=" + clientId +
		//"&" + ConstantUtils.ID_URL_SECRET_GITHUB + "=" + codeId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		HttpEntity<String> request = new HttpEntity<String>(headers);
//		Map<String,String> urlParameters = new HashMap<String,String>();
//		urlParameters.put(ConstantUtils.ID_URL_CLI_GITHUB, clientId);
		ResponseEntity<String> httpResponse = template.exchange(uri, requestType, request, String.class);
		logger.info(httpResponse.getBody());
		return httpResponse.getBody();
	}
	public JSONArray listPublicRepository(String username) {
		String response = launchHttpRequestToGithub("users/"+username+"/repos", HttpMethod.GET);		
		return new JSONArray(response);
	}
	public List<String> getAllProjectName(String username) {
		List<String> returnType = new ArrayList<String>();
		JSONArray repos = listPublicRepository(username);
		for(int i = 0 ; i < repos.length() ; i ++) {
			returnType.add((String)((JSONObject)repos.get(i)).get("name"));
			logger.info((String)((JSONObject)repos.get(i)).get("name"));
		}
		return returnType;
	}

}
