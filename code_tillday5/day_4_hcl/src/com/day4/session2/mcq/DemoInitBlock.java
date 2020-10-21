package com.day4.session2.mcq;

class A {

	// static init block runs only once : at the time of class loading
	//used to init the static variable
	static double temp;
	
	// init block
	{
		System.out.println("this is init block 2");
	}

	// init block
	{
		System.out.println("this is init block 1");
	}

	public A() {

		System.out.println("def ctr...");
	}

	public A(int a) {

		System.out.println("para ctr...");
	}
	
	static {
		System.out.println("i am static init block 1");
		temp=Math.PI;
	}
	
	static {
		System.out.println("i am static init block 2");
	}
}

public class DemoInitBlock {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("------------------------");
		A a2 = new A(444);

	}

}
