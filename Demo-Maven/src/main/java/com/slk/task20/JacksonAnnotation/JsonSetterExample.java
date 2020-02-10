package com.slk.task20.JacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ObjectMapper objectMapper = new ObjectMapper();
	//	String jString = "{\"rollNo\":1,\"name\":\"Tarun\"}";
		
		
		Student3 student3 =new Student3();
		student3.setTheName("tarun");
		
		try {
			///json setter 
		
			String string = new ObjectMapper().writeValueAsString(student3);
			System.out.println(string);
//			System.out.println("set Value  :" + student3.name);
			
			//json getter
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	}

}
class Student3
{
	private int rollNo;
	private String name;
	
	
	 public String getTheName()
	 {
		 return name;
	 }
	 @JsonSetter("student_name")
	public void setTheName(String name)
	{
		this.name = name;
	}
	 
	
	
	

}