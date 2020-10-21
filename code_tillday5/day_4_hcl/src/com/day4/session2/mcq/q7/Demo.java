package com.day4.session2.mcq.q7;

class Cat{
	public static String foo="value";// shadowing
}

class CostlyCat extends Cat{
	 public  static String foo="value2";
}
public class Demo {

	public static void main(String[] args) {

		System.out.println(new CostlyCat().foo);
	}
}

