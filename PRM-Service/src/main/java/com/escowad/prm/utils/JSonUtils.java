package com.escowad.prm.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.escowad.prm.entities.GithubRepository;

public class JSonUtils {

	
	public static Object JsonToObject(String stream, Class<?> type) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		//JSON from String to Object
		return mapper.readValue(stream,type);
	}
}
