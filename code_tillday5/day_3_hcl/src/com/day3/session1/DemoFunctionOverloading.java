package com.day3.session1;
//static method support method overloading but not overriding

class FoofDemo{
	public static void foof(Object temp) {
		System.out.println("public void foof(Object temp)");
	}
	public static void foof(String temp) {
		System.out.println("public void foof(String temp)");
	}
}
public class DemoFunctionOverloading {
	public static void main(String[] args) {
		FoofDemo.foof(null);
		
		//int sum=Calculator.add(3,6);
		
		
		//Want to use wrapper clases?
		
		//Integer it=8;
		//it++;
		
		
		//
		
	
		
		//long sum=calculator.add(2, 1L);
	}

}






class Calculator{
	public static  int add(Integer a, Integer b) {
		System.out.println("public long add(Integer a, Integer b) ");
		return a+b;
	}
	
//	public static  int add(int a, int b) {
//		System.out.println("public long add(int a, int b) ");
//		return a+b;
//	}
	
	//java 5: variable argument method
	// a refer to an array of int
	public static  int add(int   ...a) {
		System.out.println("public static  int add(int   ...a)  ");
		int sum=0;
		for(int temp: a) {
			sum+=temp;
		}
		return sum;
	}

}



