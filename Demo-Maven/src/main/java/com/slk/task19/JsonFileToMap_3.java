package com.slk.task19;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileToMap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonFileToMap_3 jsonFileToMap = new JsonFileToMap_3();
		Map<String, Object> map = jsonFileToMap.getMap(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlkMaven/Demo-Maven/src/main/java/com/slk/task19/user.json"));
	
		System.out.println(map);
	}

	private Map<String, Object> getMap(File file) {
		// TODO Auto-generated method stub
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(file, new TypeReference<HashMap<String, Object>>(){} );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new HashMap<String, Object>();
	}

}
