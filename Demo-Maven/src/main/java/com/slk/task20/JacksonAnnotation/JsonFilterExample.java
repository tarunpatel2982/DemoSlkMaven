package com.slk.task20.JacksonAnnotation;

import java.io.FileFilter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class JsonFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper objectMapper = new ObjectMapper();
		Stud2 stud2 = new Stud2(1	, 15, "Tarun");
		
		
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("NameFilter", SimpleBeanPropertyFilter.filterOutAllExcept("name"));
		
		try {
			String jString = objectMapper.writer(filterProvider).writeValueAsString(stud2);
			System.out.println(jString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}

@JsonFilter("NameFilter")
class Stud2
{
	public int id;
	public int rollNo;
	public String  name;
	public Stud2(int id, int rollNo, String name) {
	
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}
	 

}