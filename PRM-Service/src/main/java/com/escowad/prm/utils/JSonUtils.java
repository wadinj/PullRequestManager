package com.escowad.prm.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSonUtils {

	public static Logger logger = Logger.getLogger(JSonUtils.class);
	
	public static Object JsonToObject(String stream, Class<?> type) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		//JSON from String to Object
		return mapper.readValue(stream,type);
	}
	public static List<String> JSonArrayToStringList(JSONArray array, String nameOfAttribute) {
		logger.info("Converti JSonArray vers List de String");
		List<String> returnType = new ArrayList<String>();
		for(int i = 0 ; i < array.length() ; i ++) {
			returnType.add((String)((JSONObject)array.get(i)).get(nameOfAttribute));
		}
		return returnType;
	}
}
