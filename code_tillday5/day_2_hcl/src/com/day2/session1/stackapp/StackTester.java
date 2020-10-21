package com.day2.session1.stackapp;

public class StackTester {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(34);
		stack.push(3);
		stack.push(30);
		stack.push(349);
		stack.push(24);
		System.out.println("34 3 30 349 24");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		System.out.println(stack.pop());
	}
}
