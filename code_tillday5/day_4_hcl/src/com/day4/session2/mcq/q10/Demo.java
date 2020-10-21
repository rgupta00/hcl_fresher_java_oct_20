package com.day4.session2.mcq.q10;

import java.math.BigDecimal;

public class Demo {

	public static void main(String[] args) {
		
		
		BigDecimal bg=new BigDecimal("1.1");
		
		BigDecimal bg2=bg.subtract(new BigDecimal("1.00"));
		
		System.out.println(bg2);
		if(bg2.doubleValue()==0.10)
			System.out.println("yes");
		else
			System.out.println("no");
	
		
//		double d = 1.10 - 1.00;
//		System.out.println(d);
//		if (d == 0.10)
//			System.out.println("hello");
//		else
//			System.out.println("hi");
	}
}
