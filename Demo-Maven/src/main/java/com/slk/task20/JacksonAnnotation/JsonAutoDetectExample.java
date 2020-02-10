package com.slk.task20.JacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAutoDetectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		AutoDetect autoDetectClass= AutoDetect.of(1, "Tarun");
		try {
			String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(autoDetectClass);
			System.out.println(jsonString);
			
			AutoDetect a = objectMapper.readValue(jsonString, AutoDetect.class);
			
			System.out.println(a);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class AutoDetect
{
	private int id;
	private String name;
	public static AutoDetect of(int id, String name) {
		AutoDetect a= new AutoDetect();
		a.id = id;
		a.name = name;
		return a;
	}
	@Override
	public String toString() {
		return "AutoDetect [id=" + id + ", name=" + name + "]";
	}
	
	
}