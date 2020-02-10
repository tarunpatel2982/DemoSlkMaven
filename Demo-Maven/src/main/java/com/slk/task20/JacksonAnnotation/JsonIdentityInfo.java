package com.slk.task20.JacksonAnnotation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIdentityInfo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ObjectMapper mapper = new ObjectMapper();     
		 StudentEx student = new StudentEx(10,13, "Mark");
	      Book1 book1 = new Book1(1,"Learn HTML", student);
	      Book1 book2 = new Book1(2,"Learn JAVA", student);

	      student.addBook(book1);
	      student.addBook(book2);
	      
	      
	      String jsonString;
		try {
			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book1);
			 System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	     
	}

}

@com.fasterxml.jackson.annotation.JsonIdentityInfo(
		 generator = ObjectIdGenerators.PropertyGenerator.class,property = "id" )

 class StudentEx
 {
	 public int id;
	   public int rollNo;
	   public String name;
	   public List<Book1> books;
	   
	   
	   
	   StudentEx(int id, int rollNo, String name){
		      this.id = id;
		      this.rollNo = rollNo;
		      this.name = name;
		      this.books = new ArrayList<Book1>();
		   }
	   
	   
	   public void addBook(Book1 book1)
	   {
		   books.add(book1);
	   }
 }
 
 @com.fasterxml.jackson.annotation.JsonIdentityInfo(
		 generator = ObjectIdGenerators.PropertyGenerator.class,property = "id" )
 
 class Book1
 {
	 public int id;
	   public String name;

	    Book1(int id, String name, StudentEx owner){
	      this.id = id;
	      this.name = name;
	      this.owner = owner;
	   }
	   public StudentEx owner;
 }