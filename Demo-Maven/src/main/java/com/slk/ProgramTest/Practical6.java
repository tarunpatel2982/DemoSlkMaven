package com.slk.ProgramTest;

public class Practical6 {

	
	public int add(int num1, int num2)
    {
        return num1+num2;
    }
	public int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
	public int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Practical6 obj = new Practical6();
    	//This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        //This will call second add method
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
        //This will call third add method
        System.out.println("Sum of four numbers: "+obj.add(1,  2, 3, 4));
	}

}
