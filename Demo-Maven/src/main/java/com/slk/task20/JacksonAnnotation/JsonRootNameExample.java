package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper(); 
	      try {
	    	  StudentRN student = new StudentRN("Mark", 1);  
	         mapper.enable(SerializationFeature.WRAP_ROOT_VALUE); 
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
@JsonRootName(value = "student") 
class StudentRN {
   private String name; 
   private int rollNo; 
   public StudentRN(String name, int rollNo){ 
      this.name = name; 
      this.rollNo = rollNo; 
   }  
   public String getName(){ 
      return name; 
   } 
   public int getRollNo(){ 
      return rollNo; 
   }  
}