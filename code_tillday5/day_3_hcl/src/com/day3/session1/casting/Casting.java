package com.day3.session1.casting;
class A {
	void foo() {
		System.out.println("foo of A");
	}
}
class B extends A {
	void foo() {
		System.out.println("foo of B");
	}
}
class C extends A {
	void foo() {
		System.out.println("foo of C");
	}
}

public class Casting {
	public static void main(String[] args) {
		
		
		
//		
//		String a="india";
//		if( a instanceof Object) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		
		
		
		
		
		
//
//		A b1 = new B(); // upcasting
//
//		A c1 = new C(); // upcasting
//
//		// "instanceOf" operator: save you from that problem of "ClassCastException"
//		// instaceOf opeator works at run time
//
//		//instanceof : check parenthood it chech wheter c1 have something to do wiht B
//		if (c1 instanceof B) {
//			B b = (B) c1; // ClassCastException
//
//			b.foo();
//		}else {
//			System.out.println("they are not compatable");
//		}

		// B b=new A();// downcasting

		// Strongly typed language!

		/*
		 * double a=55.78; int i=(int) a; //static typecasting!
		 * 
		 * int temp=77; double temp2=temp;// upcasting is natural no body complains
		 */

	}

}
