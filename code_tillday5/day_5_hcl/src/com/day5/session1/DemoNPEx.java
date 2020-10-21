package com.day5.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoNPEx {
	public static void main(String[] args) {
		//example
		int a, b=0,c=0;
		Scanner scanner=new Scanner(System.in);
		
		try {	
			System.out.println("PE first no");
			a=scanner.nextInt();
			
			System.out.println("PE first no");
			b=scanner.nextInt();
			c=a/b;
			System.out.println(c);
			System.out.println("hello");
			
		}catch(ArithmeticException |InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("clean up code");
			scanner.close();
		}
		
		System.out.println("Done!");
		
	}
}




