package com.slk.task19.Jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TraversingJSON_4_1 {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper objectMapper = new ObjectMapper();
		
		File file= new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlkMaven/Demo-Maven/src/main/java/com/slk/task19/user.json");
		JsonNode root= objectMapper.readTree(file);
		
		//get Id 
		
		long  id=root.path("id").asLong();
		System.out.println("is  : ");
		
		//Get Name 
		
		JsonNode nameNode= root.path("name");
		if(!nameNode.isMissingNode()) //if "name "  node is exist
		{
			System.out.println("First name  : " + nameNode.path("first").asText());

			System.out.println("Middle name  : " + nameNode.path("middle").asText());

			System.out.println("Last name  : " + nameNode.path("last").asText());
			
			
			
		}
		
		//get Contact
		
		JsonNode contectNode = root.path("contact");

		
		
		if(contectNode.isArray())
		{
			System.out.println("In this node an Array : " +contectNode.isArray());
			for (JsonNode jsonNode : contectNode) {
				String type =jsonNode.path("type").asText();

				String ref =jsonNode.path("ref").asText();
				
				
				System.out.println("Type  : " + type);
				System.out.println(" Ref : "+ ref);
			}
		}
		else
		{
			
			System.out.println("Array is Empty");
		}
	}

}
