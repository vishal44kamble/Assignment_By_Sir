package com.test;
class Parent
{
	public void getInfo()
	{
		System.out.println("parent class");
	}
}

public class Child extends Parent {
	public int getInfo(String str)
	{
		System.out.println("child class");
		return 1;
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.getInfo();

	}

}
