package com.slk.task19;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TreeModelCrudExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper objectMapper = new ObjectMapper();
		  	File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlkMaven/Demo-Maven/src/main/java/com/slk/task19/user.json");
		try {
			JsonNode  root = objectMapper.readTree(file);
			String  resultOriginal = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
			System.out.println("Before Update " + resultOriginal);
			//Update id to 1000
			((ObjectNode)root).put("id", 1000L);
		

			 // 2. If middle name is empty , update to M
			ObjectNode nameNode = (ObjectNode)root.path("name");
			if("".equals(nameNode.path("middle").asText()))
			{
				nameNode.put("middle", "M"
						+ "");
			}
			// 3. Create a new field in nameNode
			nameNode.put("NickName", "lalu");
			
			  // 4. Remove last field in nameNode
			nameNode.remove("last");
			
			
			  // 5. Create a new ObjectNode and add to root
			ObjectNode objectPositionNode = objectMapper.createObjectNode();
			objectPositionNode.put("name ", "Devloper");
			objectPositionNode.put("years", 10);
			((ObjectNode)root).set("Position", objectPositionNode);
			
			
			  // 6. Create a new ArrayNode and add to root
			
			  // 6. Create a new ArrayNode and add to root
            ArrayNode gamesNode = objectMapper.createArrayNode();

            ObjectNode game1 = objectMapper.createObjectNode().objectNode();
            game1.put("name", "Fall Out 4");
            game1.put("price", 49.9);

            ObjectNode game2 = objectMapper.createObjectNode().objectNode();
            game2.put("name", "Dark Soul 3");
            game2.put("price", 59.9);

            gamesNode.add(game1);
            gamesNode.add(game2);
            ((ObjectNode) root).set("games", gamesNode);

            // 7. Append a new Node to ArrayNode
            ObjectNode email = objectMapper	.createObjectNode();
            email.put("type", "email");
            email.put("ref", "abc@mkyong.com");

            JsonNode contactNode = root.path("contact");
            ((ArrayNode) contactNode).add(email);

            
			String  resultupate = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
			
			System.out.println(" Update " + resultupate
					);
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
