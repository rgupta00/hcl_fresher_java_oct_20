package com.day4.session2.mcq;
// 
class T{
	public static final int temp=100;
	static {
		System.out.println(" i am static block");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		System.out.println(T.temp);// we are refering value of temp, compile do code
		//optimizated .... "final"
	}
}


