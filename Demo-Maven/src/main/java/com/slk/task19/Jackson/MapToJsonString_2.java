package com.slk.task19.Jackson;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToJsonString_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<String, String> map = new HashMap<String, String>();
			map.put("Name "	, "Tarun Patel");
			map.put("Age", "30");
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				String json=  objectMapper.writeValueAsString(map);
				System.out.println(json);
				
				json=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
				System.out.println(json);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
