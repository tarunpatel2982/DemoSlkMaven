package com.slk.ProgramTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Practical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Tarun", "Valsad","Gujarat", 23));
		personList.add(new Person("Urvesh", "Dharampur","Gujarat", 26));
		personList.add(new Person("Het", "Valsad","Gujarat", 23));
		personList.add(new Person("M", "Valsad","UP", 55));
		personList.add(new Person("HJ", "Valsad","MP", 28));
		
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
		
		System.out.println(" .....................  Comparator    .......................................... ");
		
		Collections.sort(personList,new PersonNameComparator());
		
		Iterator<Person> iterator = personList.iterator();
		
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person);
			
			
		}
		
		System.out.println("..............................Comparable ................................");
			
		
		ArrayList<PerosnCompareble> personListComparable = new ArrayList<PerosnCompareble>();
		personListComparable.add(new PerosnCompareble("Tarun", "Valsad","Gujarat", 23));
		personListComparable.add(new PerosnCompareble("Urvesh", "Dharampur","Gujarat", 26));
		personListComparable.add(new PerosnCompareble("Het", "Valsad","Gujarat", 23));
		personListComparable.add(new PerosnCompareble("M", "Valsad","UP", 55));
		personListComparable.add(new PerosnCompareble("HJ", "Valsad","MP", 28));
		
		
		Collections.sort(personListComparable);
		
		for (PerosnCompareble perosnCompareble : personListComparable) {
			System.out.println(perosnCompareble.personName +  " " +  perosnCompareble.personAge  +  " " + perosnCompareble.personCity);
		}
		
	}

}
class Person
{
	String personName,personCity,personState;
	int personAge;
	public Person(String personName, String personCity, String personState, int personAge) {
	
		this.personName = personName;
		this.personCity = personCity;
		this.personState = personState;
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + ", personState=" + personState
				+ ", personAge=" + personAge + "]";
	}
	
	
	
}

class PersonNameComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.personName.compareTo(o2.personName);
	}
	
}

class PerosnCompareble implements Comparable<PerosnCompareble>
{
	
	String personName,personCity,personState;
	int personAge;
	public PerosnCompareble(String personName, String personCity, String personState, int personAge) {
	
		this.personName = personName;
		this.personCity = personCity;
		this.personState = personState;
		this.personAge = personAge;
	}

	@Override
	public int compareTo(PerosnCompareble o) {
		// TODO Auto-generated method stub
		
		
		if(personAge == o.personAge)
		{
			return 0;
		}
		else if(personAge > o.personAge)
		{
			return 1;
		}
		return-1;
		
	}
	
}