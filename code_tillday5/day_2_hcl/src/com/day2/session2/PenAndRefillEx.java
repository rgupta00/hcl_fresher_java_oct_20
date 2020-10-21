package com.day2.session2;

class Refill {
	private String color;

	public Refill(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void mark() {
		System.out.println("marking with pen of color:" + color);
	}
}

class Pen {
	private String brand;
	private double price;
	private Refill refill;

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
		this.refill = new Refill("red");
	}

	public void chageRefill(Refill refill) {
		this.refill = refill;
	}

	public void writing() {
		System.out.println("i am writing with pen of brand " + brand + " of price " + price);
		refill.mark();
	}

}

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	
}
class Trainer extends Person {
	
	private String qualification;
	private int rating;

	public Trainer(String name, String qualification, int rating) {
		super(name);
		this.qualification = qualification;
		this.rating = rating;
	}

	public void changeRating(int rating) {
		this.rating = rating;
	}

	// while teaching trainer is uing pen!
	public void teaching(Pen pen) {
		pen.writing();
	}

	public void printTrainerDetails() {
		System.out.println("trainer details: " + getName() + " quaification: " + qualification +
				" rating : " + rating);
	}
}

public class PenAndRefillEx {

	public static void main(String[] args) {

		Pen pen = new Pen("reynolds", 25);
		Trainer trainer=new Trainer("rajeev", "MTech CS", 1);
		trainer.teaching(pen);
		
	}

}
