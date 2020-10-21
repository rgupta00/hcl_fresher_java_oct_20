package com.day4.session1;

//annonymous inner class: a class with no name
// it can not have ctr!

interface Cookable {
	public void cook();
}


public class DemoAnnInnerClass {

	public static void main(String[] args) {
		

		// hey java create an annonyomus implimentation of Cookable interface
		// i dont care about the name of that imp... just give me object of that

		//Java 8: lambda expression
		
		Cookable cookable = new Cookable() {

			@Override
			public void cook() {
				System.out.println("good in heath and light on pocket!");
			}
		};

		Cookable cookable2 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("imp 2");
			}
		};

		Cookable cookable3 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("imp 3!");
			}
		};

		cookable.cook();
	}
}
