package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ObjectMapper mapper = new ObjectMapper();
	      try {
	    	  StudentPOR student = new StudentPOR("Mark", 1);
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
@JsonPropertyOrder({ "rollNo", "name" })
class StudentPOR {
	   private String name;
	   private int rollNo;
	   public StudentPOR(String name, int rollNo) {
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