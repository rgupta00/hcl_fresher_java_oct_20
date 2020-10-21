package com.day2.session2.q1;

public class Circle {
	private double radius;
	private String color="red";
	
	public Circle() {}
	public Circle(double radius) {
		
		this.radius=radius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerameter() {
		return Math.PI*radius*2;
	}
}














