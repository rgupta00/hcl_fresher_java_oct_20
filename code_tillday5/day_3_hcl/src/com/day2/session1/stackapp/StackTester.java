package com.day2.session1.stackapp;

public class StackTester {

	public static void main(String[] args) {
		// :(
		//why not i give u an contract
		Stack stack=new StackImplByPooja();
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
