package com.slk.task20.JacksonAnnotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUnwrappedExample {

	public static void main(String[] args) throws ParseException, JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
	      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	      Date date = simpleDateFormat.parse("20-12-1984");
	      StudentJUW.Name name = new StudentJUW.Name();
	      name.first = "Jane";
	      name.last = "Doe";
	      StudentJUW student = new StudentJUW(1, name);
	      String jsonString = mapper
	         .writerWithDefaultPrettyPrinter()
	         .writeValueAsString(student);
	      System.out.println(jsonString);
	   }
	}


class StudentJUW {
	   public int id;   
	   @JsonUnwrapped
	   public Name name;
	   StudentJUW(int id, Name name){
	      this.id = id;
	      this.name = name;
	   }
	   static class Name {
	      public String first;
	      public String last;
	   }
	}