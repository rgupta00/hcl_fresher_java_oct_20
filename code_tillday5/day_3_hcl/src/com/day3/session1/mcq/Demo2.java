package com.day3.session1.mcq;
class Foof{
	static void foof() {
		System.out.println(" void foof() of Foof");
	}
	 static void foof(String name) {
			System.out.println(" void foof() of Foof :"+name);
	}
}

class Foof2 extends Foof{
	//Shdowing
	static void foof() {
		System.out.println(" void foof() of Foof2");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Foof2 f=new Foof2();
		f.foof();
	}
}
