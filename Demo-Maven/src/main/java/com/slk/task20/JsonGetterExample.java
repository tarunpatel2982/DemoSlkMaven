package com.slk.task20;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ObjectMapper mapper = new ObjectMapper(); 
	      try {
	         Student1 student = new Student1("Mark", 1);    
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
class Student1 {
	   private String name;
	   private int rollNo;
	   public Student1(String name, int rollNo){
	      this.name = name;
	      this.rollNo = rollNo;
	   }
	   @JsonGetter
	   public String getStudentName(){
	      return name;
	   }
	   public int getRollNo(){
	      return rollNo;
	   }
	}