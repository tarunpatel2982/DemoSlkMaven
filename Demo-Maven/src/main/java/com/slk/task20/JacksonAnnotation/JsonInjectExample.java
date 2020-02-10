package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonInjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String json = "{\"name\":\"Mark\"}"; 
	      InjectableValues injectableValues = new InjectableValues.Std() .addValue(int.class, 1); 
	      
	      ObjectMapper mapper = new ObjectMapper();    
	      try {
	    	  StudentJIJ student = mapper .reader(injectableValues) .forType(StudentJIJ.class) .readValue(json); 
	         System.out.println(student.rollNo +", " + student.name); 
	      }
	      catch (IOException e) { 
	         e.printStackTrace(); 
	      }   
	}

}
class StudentJIJ {
	   public String name; 
	   @JacksonInject 
	   public int rollNo;  
	}