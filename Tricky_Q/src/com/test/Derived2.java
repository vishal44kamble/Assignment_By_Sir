package com.test;
class Base2
{
	public static void Task()
	{
		System.out.println("base");
	}
}

public class Derived2 extends Base2{
	public static void Task()
	{
		System.out.println("Derived");
	}

	public static void main(String[] args) {
           Base2 obj=new Derived2();
           obj.Task();
	}

}
