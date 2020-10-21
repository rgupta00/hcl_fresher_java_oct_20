package com.day2.session1.stackapp;

public class BookStackTester {

	public static void main(String[] args) {
		BookStack bookStack=new BookStack();
		bookStack.push(new Book(121, "java", 1000));
		bookStack.push(new Book(1, "python", 400));
		bookStack.push(new Book(3, "C", 900));
		bookStack.push(new Book(89, "C++", 200));
		bookStack.push(new Book(11, "Rich dad poor dad", 200));
		//bookStack.push(new Book(141, "effective java", 700));
		
		Book b1=bookStack.pop();
		Book b2=bookStack.pop();
		Book b3=bookStack.pop();
		Book b4=bookStack.pop();
		Book b5=bookStack.pop();
		//Book b6=bookStack.pop();
		
		b1.printBookDetails();
		b2.printBookDetails();
		b3.printBookDetails();
		b4.printBookDetails();
		b5.printBookDetails();
		
		
		
	}
}
