package com.slk.task20.JacksonAnnotation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBackReferenceAndJsonMangeReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper objectMapper = new ObjectMapper();
		Stud s = new Stud(1, "tarun");
		Book book1 = new Book(1,"java",s);

		Book book2 = new Book(5,"Html",s);
		
		s.addBook(book1);
		s.addBook(book2);
		
		
		try {
			String jsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book2);
			System.out.println(jsString);
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Stud
{
	public int rollNo;
	public String name;
	
	@JsonBackReference
	public List<Book> books;


	public Stud(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		this.books = new ArrayList<Book>();
	}
	public void addBook(Book book)
	{
		books.add(book);
	}
	
}
class Book
{
	public int id;
	public String name;
	public Book(int id, String name, Stud owner) {
		this.id = id;
		this.name = name;
		this.owner = owner;
	}
	@JsonManagedReference
	public Stud owner;
	
}