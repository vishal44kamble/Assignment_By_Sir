package com.test;
class Parent2
{
	public Parent2(String s)
	{
		System.out.println("parent");
	}
}

public class Child2 extends Parent2 {

	public Child2(String s) {
		System.out.println("child");

	}

	public static void main(String[] args) {
		new Child2("vishal");

	}

}
