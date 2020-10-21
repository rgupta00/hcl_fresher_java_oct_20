package com.day3.session1.mcq;

 class Foo{
	
	
}

class A{
	public void foof(){
		System.out.println("hello");

	}
	 void foof(String name){
		System.out.println("hello "+ name);

	}
}

class B extends  A{
    public  void foof(){
    	  System.out.println("bye");

	}
}
public class Demo1 {
	public static void main(String[] args) {
		
		Foo f=new Foo();
		
		A a=new B();
		a.foof();
	}
}
