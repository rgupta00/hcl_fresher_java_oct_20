package com.day4.session2.mcq.q8;
public class Confusion {

	public Confusion(Object o){
		System.out.println("public Confusion(Object o)");
	}
	
//	public Confusion(String o){
//		System.out.println("public Confusion(String o)");
//	}
	public Confusion(double[] o){
		System.out.println("public Confusion( double[] o)");
	}
			
	public static void main(String[] args) {
		
		new Confusion(null);
		
	}
	
}