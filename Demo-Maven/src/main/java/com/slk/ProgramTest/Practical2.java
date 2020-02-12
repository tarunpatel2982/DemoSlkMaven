package com.slk.ProgramTest;

public class Practical2 {

	
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
	
	public static void secondpattern()
	 {
		 int n =4 ;
		 for (int i = 0; i<n; i++) 
		 {
			
			 for (int j = n-i; j>1; j--)
			 {
				System.out.print(" ");
			}
			 
			 
			 for (int k = 0; k <=i; k++)
			 {
				System.out.print("* ");
			}
			 System.out.println();
		}
	 }
	
	public static void thirdPattern()
	{
		int n=4;
		for(int i =1;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}
	public static void forthPattern()
	{
		int n =5;
		for(int i =1;i<=n;i++)
		{
			for(int j= n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	  
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstPattern();   
	    secondpattern();
		thirdPattern();
		forthPattern();
	}

}
