package com.day4.session2.mcq.q6;

class Cat{
	public static void meow(){
		System.out.println("meow");
	}
}

class CostlyCat extends Cat{
	public static void meow(){
		System.out.println("costly meow");
	}
}
public class Demo {

	public static void main(String[] args) {

		CostlyCat c=new CostlyCat();
		
		c.meow();
	}


}