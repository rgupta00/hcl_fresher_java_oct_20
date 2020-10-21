package com.day4.session2.mcq.q8;
class A{
	
	void method(int i){
		System.out.println("base method ");
	}
}
class B extends A{
	
	void method(Integer i){
		System.out.println("overriden method ");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.method(22);
	}
}
