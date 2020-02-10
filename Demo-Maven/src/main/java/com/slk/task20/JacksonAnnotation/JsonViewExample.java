package com.slk.task20.JacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonViewExample {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();     
		StudentJV student = new StudentJV(1, "Mark", 12);
	      String jsonString = mapper
	         .writerWithDefaultPrettyPrinter()
	         .withView(Views.Public.class)
	         .writeValueAsString(student);
	      System.out.println(jsonString);
	}

}
class StudentJV {
	   @JsonView(Views.Public.class)
	   public int id;
	   @JsonView(Views.Public.class)
	   public String name;
	   @JsonView(Views.Internal.class)
	   public int age;

	   StudentJV(int id, String name, int age) {
	      this.id = id;
	      this.name = name;
	      this.age = age;
	   }
	}
	class Views {
	   static class Public {}
	   static class Internal extends Public {}
	}