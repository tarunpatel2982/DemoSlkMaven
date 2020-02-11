package com.slk.ProgramTest;

public class PatternExample {

	
	public static void firstPattern()
	{
		for (int i = 0; i <=5; i++)
		{
			
			for (int j = -1; j <i; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			System.out.println("----------------------------------------------------------------");
		for (int i = 0; i <=5; i++) 
		{
			
			for (int j = -1; j <i; j++) {
				System.out.print("*");
			}
			for (int k = i; k <5; k++) {
				System.out.print(".");
			}
			System.out.println();
			
		}
			
		
		
		
				
	}
	
	
	public static void secondPattern()
	{
		for (int i = 0; i <=5; i++) {
			
			
		}
	}
	
	public static void thirdPattern()
	{
		int k;
		for (int i = 0; i <=5; i++) {
			
			for ( k= 0; k <=4-1; k++) {
				System.out.print(" ");
			}
			for (int j = k+1; j <=i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		firstPattern();
//		secondPattern();
		thirdPattern();
	}

}
