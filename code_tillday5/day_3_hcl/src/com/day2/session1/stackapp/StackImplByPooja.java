package com.day2.session1.stackapp;

public class StackImplByPooja implements Stack {
	private int x[];
	private final int SIZE;
	private int top;

	public StackImplByPooja() {
		SIZE = 5;
		x = new int[SIZE];
		top = -1;// stack is empty initially
	}

	@Override
	public int pop() {
		int value = -999;
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else
			value = x[top--];
		return value;
	}

	private boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	@Override
	public void push(int data) {
		if (isFully())
			System.out.println("stack is full");
		else {
			x[++top] = data;
		}
	}

	private boolean isFully() {
		return (top == SIZE - 1) ? true : false;
	}

}
