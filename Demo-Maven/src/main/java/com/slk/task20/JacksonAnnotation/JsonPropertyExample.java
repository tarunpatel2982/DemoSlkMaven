package com.slk.task20.JacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyExample {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		 ObjectMapper mapper = new ObjectMapper();
	      String json = "{\"id\" : 1}";
	      StudentPr student = mapper.readerFor(StudentPr.class).readValue(json);
	      System.out.println(student.getTheId());
	}

}
class StudentPr {
	   private int id;
	   StudentPr(){}
	   StudentPr(int id){
	      this.id = id;
	   }
	   @JsonProperty("id")
	   public int getTheId() {
	      return id;
	   }
	   @JsonProperty("id")
	   public void setTheId(int id) {
	      this.id = id;
	   }   
	}