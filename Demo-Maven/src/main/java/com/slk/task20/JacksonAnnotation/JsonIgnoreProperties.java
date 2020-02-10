package com.slk.task20.JacksonAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		      ObjectMapper mapper = new ObjectMapper();
		      try {
		    	  StudentIGP student = new StudentIGP(1,11,"1ab","Mark");       
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
@com.fasterxml.jackson.annotation.JsonIgnoreProperties({ "id", "systemId" })
class StudentIGP {
   public int id;
   public String systemId;
   public int rollNo;
   public String name;

   StudentIGP(int id, int rollNo, String systemId, String name){
      this.id = id;
      this.systemId = systemId;
      this.rollNo = rollNo;
      this.name = name;
   }
}