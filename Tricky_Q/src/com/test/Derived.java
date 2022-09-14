package com.test;
abstract class Base
{
	public int a;
	Base()
	{
		a=10;
	}
	 abstract final public void Task();
}

public class Derived extends Base {
	final public void Task()
	{
		System.out.println("a="+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Derived obj=new Derived();
        obj.Task();
        
	}

}
