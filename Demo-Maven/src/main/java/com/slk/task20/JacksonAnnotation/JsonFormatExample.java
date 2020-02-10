package com.slk.task20.JacksonAnnotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

public class JsonFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper objectMapper = new ObjectMapper();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			Date date = simpleDateFormat.parse("20-11-1995");
			
			
			Student2 student2 = new Student2(1, date);
			
			
			String jString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student2);
			
			System.out.println(jString);
			
		} catch (ParseException | JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
class Student2
{
	public int id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	
	public Date birthDate;

	
	public Student2(int id, Date birthDate) {
	
		this.id = id;
		this.birthDate = birthDate;
	}
	
}