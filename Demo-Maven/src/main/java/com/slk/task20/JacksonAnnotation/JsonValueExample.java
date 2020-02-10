package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper(); 
	      try { 
	    	  StudentJSV student = new StudentJSV("Mark", 1);    
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
class StudentJSV {
	   private String name;
	   private int rollNo;
	   public StudentJSV(String name, int rollNo){
	      this.name = name;
	      this.rollNo = rollNo;
	   }
	   public String getName(){
	      return name;
	   } 
	   public int getRollNo(){
	      return rollNo;
	   }
	   @JsonValue
	   public String toString(){
	      return "{ name : " + name + " }";
	   }
	}