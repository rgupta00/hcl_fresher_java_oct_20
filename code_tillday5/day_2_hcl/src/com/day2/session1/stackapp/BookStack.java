package com.day2.session1.stackapp;

public class BookStack {
	private Book x[];
	private final int SIZE;
	private int top;

	public BookStack() {
		SIZE = 5;
		x = new Book[SIZE];
		top = -1;// stack is empty initially
	}

	public Book pop() {
		Book value = new Book(-999, "", 0.0);
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			value = x[top];
			x[top]=null;// so that we avoid "memory leak"
			top--;
		}
		return value;
	}


	public void push(Book book) {
		if (isFull())
			System.out.println("stack is full");
		else {
			x[++top] = book;
		}
	}
	
	private boolean isEmpty() {
		return (top == -1) ? true : false;
	}


	private boolean isFull() {
		return (top == SIZE - 1) ? true : false;
	}

}
