package com.day3.session1;

public class DemoOnCommandLineArg {
	
	public static void main(String[] args) {
		// to echo the name which i pass as command line arg
		int sum=0;
		for(String temp: args) {
			//Integer.parseInt(s): convert string to int
			sum=sum+Integer.parseInt(temp);
		}
		System.out.println("sum is :"+ sum);
	}

}
