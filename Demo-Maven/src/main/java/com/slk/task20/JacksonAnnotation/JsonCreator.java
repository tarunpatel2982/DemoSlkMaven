package com.slk.task20.JacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String json ="{\"id\":1, \"theName\":\"Tarun\"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Stud1 stud1 = objectMapper.readerFor(Stud1.class).readValue(json);
			System.out.println(stud1.rollNo + " ,  " 	+ stud1.name);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class Stud1
{
	public String name;
	public int rollNo;
	
	@com.fasterxml.jackson.annotation.JsonCreator
	public Stud1 ( @JsonProperty("theName") String name, @JsonProperty("id") int rollNo) {
	
		this.name = name;
		this.rollNo = rollNo;
	}
	
}