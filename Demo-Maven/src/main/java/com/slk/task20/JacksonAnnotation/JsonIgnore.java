package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ObjectMapper mapper = new ObjectMapper();
	      try{
	    	  StudentIG student = new StudentIG(1,11,"1ab","Mark");       
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
class StudentIG { 
	   public int id;
	 @com.fasterxml.jackson.annotation.JsonIgnore
	   public String systemId;
	   public int rollNo;
	   public String name;

	   StudentIG(int id, int rollNo, String systemId, String name){
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      this.name = name;
	   }
	}