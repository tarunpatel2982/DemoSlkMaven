package com.slk.Demo_Maven;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		 ObjectMapper mapper = new ObjectMapper();
	        String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";

	        try {

	            // convert JSON string to Map
	            Map<String, String> map = mapper.readValue(json, Map.class);

				// it works
	            //Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});

	            System.out.println(map);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    }
}
