package com.slk.task19.Jackson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrversingJsonArray_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlkMaven/Demo-Maven/src/main/java/com/slk/task19/Jackson/user.json");
		try {
				JsonNode  rootArray = objectMapper.readTree(file);
					for (JsonNode jsonNode : rootArray) 
					{
						System.out.println(jsonNode);
							//get Id
							
							long id=  jsonNode.path("id").asLong();
							
							
							System.out.println("Id   : " + id );
							
							//get Name 
							
							JsonNode nameNode =jsonNode.path("name");
							
							if(!nameNode.isMissingNode())
							{
								System.out.println("First Name : " + nameNode.path("first").asText());
			
								System.out.println("Middle Name : " + nameNode.path("middle").asText());
			
								System.out.println("Last Name : " + nameNode.path("last").asText());
							}
							
							//get Contect
							
							JsonNode contectNode = jsonNode.path("contact");
								if(contectNode.isArray())
								{
									for (JsonNode jsonNode2 : rootArray) {
										System.out.println("Type : " + jsonNode2.path("type").asText());

										System.out.println("ref : " + jsonNode2.path("ref").asText());
									}
								}else
								{
									System.out.println("Array Is Empty");
								}
						System.out.println("......................................................................................");
					}
		}catch(FileNotFoundException f)
	
		{
			f.fillInStackTrace();
		}
		catch (JsonProcessingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
