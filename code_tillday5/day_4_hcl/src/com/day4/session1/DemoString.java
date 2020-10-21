package com.day4.session1;

public class DemoString {
	public static void main(String[] args) {
		String a="india";
		
		//hey java first lookup in the string pool if u find
		//that string from the pool ignore new operator and give back the 
		//same objet from the spring pool
		String b=new String("india").intern();
		
		if(a==b)
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
