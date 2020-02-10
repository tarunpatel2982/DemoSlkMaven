package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRowValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ObjectMapper mapper = new ObjectMapper();
	      try {
	    	  StudentRV student = new StudentRV("Mark", 1, "{\"attr\":false}");    
	         String jsonString = mapper 
	            .writerWithDefaultPrettyPrinter() 
	            .writeValueAsString(student); 
	         System.out.println(jsonString); 
	      }
	      catch (IOException e) { 
	         e.printStackTrace(); 
	      }   
	}

}
class StudentRV { 
	   private String name; 
	   private int rollNo; 
	   @JsonRawValue
	   private String json;  
	   public StudentRV(String name, int rollNo, String json){
	      this.name = name; 
	      this.rollNo = rollNo; 
	      this.json = json; 
	   }  
	   public String getName(){ 
	      return name; 
	   } 
	   public int getRollNo(){ 
	      return rollNo; 
	   } 
	   public String getJson(){ 
	      return json; 
	   }  
	}