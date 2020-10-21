package com.day2.session1.stackapp;

public class Book {
	private int id;
	private String title;
	private double price;
	
	
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printBookDetails() {
		System.out.println("book information: id "+ id+" title: "+ title+" price: "+ price);
	}
	
	
}
