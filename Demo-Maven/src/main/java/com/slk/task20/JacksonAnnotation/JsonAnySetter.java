package com.slk.task20.JacksonAnnotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		 String jsonString = "{\"RollNo\" : \"1\",\"Name\" : \"Mark\"}"; 
		
		try {
			
			A a = objectMapper.readerFor(A.class).readValue(jsonString);
			
			System.out.println(a.getProperties().get("Name"));
			System.out.println(a.getProperties().get("RollNo"));
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
class A
{
	private Map<String, String> properties;
	public A()
	{
		properties= new HashMap();
	}
	
	public Map<String, String> getProperties()
	{
		return properties;
	}
	@com.fasterxml.jackson.annotation.JsonAnySetter
	public void add(String pro,String val)
	{
		properties.put(pro	, 	val);
	}
}