package com.slk.task19;

import java.io.File;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class ReadJsonParserStriming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file= new File("gen.json");
		try(JsonParser jParser= new JsonFactory().createParser(file))
		{
					if(jParser.nextToken() == JsonToken.START_ARRAY)
					{
						
					
						//System.out.println(".........................................................................");
						while (jParser.nextToken()!=JsonToken.END_ARRAY) 
						{
							
								while (jParser.nextToken()!=JsonToken.END_OBJECT) 
								{
									
								
									String fieldName = jParser.getCurrentName();
									if("name".equals(fieldName))
										{
											jParser.nextToken();
											System.out.println(jParser.getText());
										}
									
									
									if("age".equals(fieldName))
										{
											jParser.nextToken();
											System.out.println(jParser.getText());
										}
									
									if("messages".equals(fieldName))
									{
											if(jParser.nextToken() == JsonToken.START_ARRAY)
											{
													while (jParser.nextToken()!=JsonToken.END_ARRAY)
													{
														
														System.out.println(jParser.getText());
													}
											}
										System.out.println(".........................................................................");
									}
									
								}
								
						}
			}	
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

}
