package com.day4.session2.mcq.q5;

class A {
	public  static void foo() {
		System.out.println(" i am static  method");
	}
}

public class Demo {

	public static void main(String[] args) {
		//java optimization
		
		A a = null;
		
		a.foo();
	//	A.foo();

	}

}
