package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIncludeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ObjectMapper mapper = new ObjectMapper();
	      try {
	    	  StudentIn student = new StudentIn(1,null);       
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
@JsonInclude(JsonInclude.Include.NON_NULL)
class StudentIn { 
   public int id; 
   public String name;

   StudentIn(int id,String name){
      this.id = id;
      this.name = name;
   }   
}