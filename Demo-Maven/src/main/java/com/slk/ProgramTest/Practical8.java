package com.slk.ProgramTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Practical8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		File f;
		f=new File("myfile.txt");
		
		try {
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("File Creqated ");
			}else
			{
				System.out.println("File Already Exist ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Array List data ");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello  ");
		arrayList.add("Hello  ");
		arrayList.add("Hello  ");
		arrayList.add("Hello  ");
		System.out.println(arrayList);
		
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(arrayList);
		objectOutputStream.close();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(" read File data ");
		FileInputStream fileInputStream = new FileInputStream(f);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<String> al =(ArrayList<String>)objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(al);
		
		
		
		
		
	}
}
