package com.slk.task20.JacksonAnnotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetter_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = new Student();
		student.add("Name", "Tarun");
		student.add("Age", "25");
		
		try {
			String json =  objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Student
{
	private Map<String, String> map;

	public Student() {
		map = new HashMap<String, String>();
	}
	
	//Json Serialization Annotation
	//this Annotation Remove Checked The OutPut
	@JsonAnyGetter//this Annotation Used For Remove Properties Object Name
	public Map<String, String> getProperties()
	{
		return map;
	}
	public void add(String pro,String val)
	{
		map.put(pro, val);
	}
	
	
}