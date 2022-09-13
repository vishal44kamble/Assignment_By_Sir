package com.test;



class Person
{
	String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}
}
public class Task 
{
	public static void main(String[] args) {
		Person p1=new Person("akshay");
		Person p2=new Person("akshay");
		if(p1==p2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		if(p1.equals(p2))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
	
}

