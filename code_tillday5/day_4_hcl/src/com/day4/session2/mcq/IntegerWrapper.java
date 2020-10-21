package com.day4.session2.mcq;

public class IntegerWrapper {

	
	public static void main(String[] args) {
		
		// code optimization, cache: fast memory access area 
		
		Integer i1=Integer.valueOf(127);
		
		
		Integer i2=Integer.valueOf(127);
		System.out.println(i1==i2);//true
		
		Integer i3=Integer.valueOf(128);
		Integer i4=Integer.valueOf(128);
		System.out.println(i3==i4);//false
	}
}
