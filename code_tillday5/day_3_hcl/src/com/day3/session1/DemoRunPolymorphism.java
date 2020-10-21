package com.day3.session1;

import java.util.Scanner;

import javax.sound.midi.Track;

abstract class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public void printColor() {
		System.out.println("color of shape is: " + color);
	}

	//i need method sign but without implementation
	// abstract method: is a method whose defination is not complete , next generation must
	// override this mehtod
	
	public abstract void printArea();
}

class Triangle extends Shape {
	public Triangle(String color) {
		super(color);
	}

	@Override
	public void printArea() {
		System.out.println("Area: 1/2 *b*h");
	}
}

class Circle extends Shape {
	public Circle(String color) {
		super(color);
	}

	@Override
	public void printArea() {
		System.out.println("Area: PI * r *r");
	}
}

class Rectangle extends Shape {
	public Rectangle(String color) {
		super(color);
	}
	@Override
	public void printArea() {
		System.out.println("Area: l*b");
	}
}

public class DemoRunPolymorphism {

	public static void main(String[] args) {

		// pointer of base class= object of drived class
			Shape shape  			= new Rectangle("red");
			
		shape.printArea();
		shape.printColor();
		
		// this will not compile => ie u cant assignd object of drived class to the base class ref!
	//	Rectangle r=new Shape();
		
		
		
		
		
		
		
//		Shape shape=null;
//		System.out.println("PE the shape...1.Trai 2.Circle  3. Rectangle");
//		Scanner scanner=new Scanner(System.in);
//		
//		int choice=scanner.nextInt();
//		
//		if(choice==1) {
//			shape=new Triangle();
//		}else if(choice==2) {
//			shape=new Circle();
//		}else if(choice==3) {
//			shape=new Rectangle();
//		}
//		
//		shape.printArea();
//		
//		scanner.close();
	}

}
