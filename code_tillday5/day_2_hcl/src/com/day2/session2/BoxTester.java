package com.day2.session2;


class Box{
	private int l, b;
	
	public Box() {}
	public Box(int l, int b) {
		this.l=l;
		this.b=b;
	}
	public void print() {
		System.out.println("l:"+ l);
		System.out.println("b:"+ b);
	}
	

}

class Box3D extends Box{
	private int h;
	
	public Box3D() {}
	public Box3D(int l, int b, int h) {
		super(l, b);
		this.h=h;
	}
	public void print() {
		super.print();
		System.out.println("h:"+ h);
	}
}

class Box3DWithColor extends Box3D{
	private String color;
	
	public Box3DWithColor() {}
	public Box3DWithColor(int l, int b, int h, String color) {
		super(l, b,h);
		this.color=color;
	}
	public void print() {
		super.print();
		System.out.println("color:"+ color);
	}
}


public class BoxTester {
	
	public static void main(String[] args) {
		
		Box3DWithColor box=new Box3DWithColor(4,5,6,"blue");
		box.print();
	}

}






