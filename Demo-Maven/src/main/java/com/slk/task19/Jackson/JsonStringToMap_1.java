package com.slk.task19.Jackson;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringToMap_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="{\"name\":\"Tarun\",\"age\":\"25\"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			Map<String, String> map = objectMapper.readValue(s, Map.class);
			
			System.out.println("Test Map Value :  " + map);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
