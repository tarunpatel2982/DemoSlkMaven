package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
	      try {
	    	  StudentIGT student = new StudentIGT(1,11,"1ab","Mark");       
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
class StudentIGT { 
	   public int id;
	  @JsonIgnore
	   public String systemId;
	   public int rollNo;
	   public Name nameObj;

	   StudentIGT(int id, int rollNo, String systemId, String name){
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      nameObj = new Name(name);
	   }

	   @JsonIgnoreType
	   class Name {
	      public String name;
	      Name(String name){
	         this.name = name;
	      }       
	   }
	}