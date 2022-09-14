package com.test;
class Base3
{
	public Base3()
	{
		System.out.println("Base");
	}
}

public class Chlid3 extends Base3 {
	public Chlid3()
	{
		System.out.println("Derived");
		super();
	}

	public static void main(String[] args) {
		Derived obj=new Derived();

	}

}
