package com.slk.ProgramTest;
//String Operation
public class Practical4 {

	
	public static void stringToChar()
	{
		//String to Char 
		
				String srt1 = " Jay Hind" ;
				  
				char [] a = srt1.toCharArray();
				
				for (int i = 0; i < a.length; i++) {
					System.out.println("String to char  : " + a[i]);
				}
	}
	
	public static void charToString()
	{
		char [] a = {'J','a','y',' ','H','i','n','d'};
		
		String str =  new String().valueOf(a);
		System.out.println(str);
		
	}
	public static void removeSpace() {
		
		String s =" Jay Hind";
		
		
		System.out.println(s.replaceAll("\\s", ""));
	}
	
	public static void ConvertLowerCaseToUperCase()
	{
		String s = "jay hind";
		String uparCase = s.toUpperCase();
		System.out.println(uparCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
	}
	public static void reverseString()
	{
		String s = "Jay Hind" ;
		
		char [] a = s.toCharArray();
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		stringToChar();
//		charToString();
		
//		removeSpace();
//		ConvertLowerCaseToUperCase();
		
		reverseString();
		
	}

}
