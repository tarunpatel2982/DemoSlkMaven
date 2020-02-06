package com.slk.task19;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadAndWriteExampl {

	
	public static void writeObject()
	{
		 File f = new File("RedAndWrite.json");
		ObjectMapper objectMapper = new ObjectMapper();
		try(JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(f,JsonEncoding.UTF8))
		{
			jsonGenerator.useDefaultPrettyPrinter();
			jsonGenerator.writeStartObject();
			jsonGenerator.writeFieldName("student");
			jsonGenerator.writeStartArray();
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("name","Tarun");
			jsonGenerator.writeNumberField("Age", 10);
			jsonGenerator.writeFieldName("Adress");
			jsonGenerator.writeStartArray();
			jsonGenerator.writeString("Kharvel ");

			jsonGenerator.writeString("Nishal Faliya  ");

			jsonGenerator.writeString("Dharampur ");
			jsonGenerator.writeEndArray();
			jsonGenerator.writeEndObject();
			jsonGenerator.writeEndArray();
			jsonGenerator.writeEndObject();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void ReadObject()
	{
		 File f = new File("RedAndWrite.json");
		try(JsonParser jsonParser = new JsonFactory().createParser(f))
		{
			if(jsonParser.nextToken() == JsonToken.START_OBJECT)
			{
					while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
					
						String fieldName = jsonParser.getCurrentName();
						if("student".equals(fieldName))
						{
//							
							System.out.println(jsonParser.getText());
							//jsonParser.nextToken();
							
							
							if(jsonParser.nextToken() == JsonToken.START_ARRAY)
							{
								
							
								while (jsonParser.nextToken()!=JsonToken.END_ARRAY) {
//									jsonParser.nextToken();
//									jsonParser.nextToken();
									
									String fieldName2 = jsonParser.getCurrentName();
									if("name".equals(fieldName2))
									{
										jsonParser.nextToken();
										System.out.println(jsonParser.getText());
										
									}
									if("Age".equals(fieldName2))
									{
										jsonParser.nextToken();
										System.out.println(jsonParser.getText());
										
									}
									
									if("Adress".equals(fieldName2))
									{
										
									
										if(jsonParser.nextToken() == JsonToken.START_ARRAY)
										{
											while (jsonParser.nextToken()!=JsonToken.END_ARRAY) {
											
												System.out.println(jsonParser.getText());
												
											}
										}
									}
									
									
								}
							}
						}
						
					
						//System.out.println(fieldName);
						System.out.println("..............................................................");
					}
				
			}else
			{
				System.out.println("Not Foud data");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		 
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadObject();
	}

}
