package com.slk.ProgramTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortArrayFiveWay_1 {

	
	public static void oneWay()
	{
		System.out.println("..........................accending Order ....................................");
		int [] arr = {10,1,12,1,3,2,4,};
		
		
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		
	}
	public static void secondWay()
	{
		System.out.println("..........................decending Order ....................................");
		
		int [] arr = {10,10,12,1,3,2,4,};
		
		
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		
	}
	
	public static void threeWay()
	{
		int [] arr = {10,10,12,1,3,2,4,};
		
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	public static void forthWay()
	{
		Integer  arr[] = {10,10,12,1,3,2,4};
	
		
		System.out.println(Arrays.toString(arr));
		List<Integer> list = convertArrayToList(arr);
		
		Collections.sort(list);
		
		
		
		
		Iterator<Integer> iterator = list.iterator();
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			
			System.out.println("Test "+ integer);
		}
		
		
		
	}
	public static <T> List<T> convertArrayToList(T arr[])
	{
		List<T> list = Arrays.asList(arr);
		
		return list;
	}
	
	public static void fiveWay()
	{
		
		System.out.println("............................ Reverse  Orderd .........................." );
		Integer  arr[] = {10,10,12,1,3,2,4};
	
		
		//System.out.println(Arrays.toString(arr));
		List<Integer> list = convertArrayToArrayList(arr);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
	
		
	}
	
	public static <T> ArrayList<T> convertArrayToArrayList(T arr[])
	{
		
		List<T> list = Arrays.asList(arr); 
		
		
		ArrayList<T> list1= new ArrayList<T>();
		list1.addAll(list);
		
		return list1;
	}
	
	
	public static void sixway()
	{
		int arr[] = {5,3,8,1,6,4,8,15};
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oneWay();
//		secondWay();
//		threeWay();
//		forthWay();
//		fiveWay();
		sixway();
	}

}


