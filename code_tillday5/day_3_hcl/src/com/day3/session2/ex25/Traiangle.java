package com.day3.session2.ex25;

public class Traiangle {
	private Point pointA;
	private Point pointB;	
	private Point pointC;
	
	public Traiangle(Point pointA, Point pointB, Point pointC) {	
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Traiangle(int x1, int y1, int x2, int y2,int x3, int y3) {	
		this.pointA = new Point(x1, y1);
		this.pointB = new Point(x2, y2);
		this.pointC = new Point(x3, y3);
	}

	@Override
	public String toString() {
		return "Traiangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
	public double getPerimeter() {
		//double l1=Math.sqrt(Math.pow((pointB.getX()-pointA.getX()), 2)+ Math.pow((y2-y1), 2));
		// l2, l3
		return 0.0;
	}
	
}
