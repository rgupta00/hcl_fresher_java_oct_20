package com.day2.session2.q3;

public class Tester {
	public static void main(String[] args) {
		
		Person person=new Student("amit", "banglore", "BTech", 4, 40000);
		
		
		//com.day2.session2.q3.Person@15db9742
		
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(person);
	}

}
