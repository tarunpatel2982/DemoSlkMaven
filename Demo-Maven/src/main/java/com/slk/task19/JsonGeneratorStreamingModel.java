package com.slk.task19;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGeneratorStreamingModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file= new File("gen.json");
		
		  ObjectMapper mapper = new ObjectMapper();

	        try (JsonGenerator jGenerator =mapper.getFactory().createGenerator(file , JsonEncoding.UTF8)) {

	            // pretty print
	            jGenerator.useDefaultPrettyPrinter();//json file in structredwise data stored

	            // start array
	            jGenerator.writeStartArray();                                   // [

	            jGenerator.writeStartObject();                                  // {

	            jGenerator.writeStringField("name", "Tarun");  				// "name" : "tarun"
	            jGenerator.writeNumberField("age", 25);         				// "age" : 38

	            jGenerator.writeFieldName("messages");                          // "messages" :

	            jGenerator.writeStartArray();                                   // [

	            jGenerator.writeString("msg 1");                            	// "msg 1"
	            jGenerator.writeString("msg 2");                            	// "msg 2"
	            jGenerator.writeString("msg 3");                            	// "msg 3"

	            jGenerator.writeEndArray();                                     // ]

	            jGenerator.writeEndObject();                                    // }

	            // next object, pls

	            jGenerator.writeStartObject();                                  // {

	            jGenerator.writeStringField("name", "Urevsh");  					// "name" : "Urevsh"
	            jGenerator.writeNumberField("age", 22);         					// "age" : 22

	            jGenerator.writeFieldName("messages");                          // "messages" :

	            jGenerator.writeStartArray();                                   // [

	            jGenerator.writeString("msg a");                            	// "msg a"
	            jGenerator.writeString("msg b");                            	// "msg b"
	            jGenerator.writeString("msg c");                            	// "msg c"

	            jGenerator.writeEndArray();                                     // ]

	            jGenerator.writeEndObject();                                    // }

	            jGenerator.writeEndArray();                                     // ]

	        } catch (JsonGenerationException e) {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		
	}

}
