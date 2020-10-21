package com.day3.session2;

interface A {
	 void foof();
}

class B implements A {

	public  void foof() {
	}
}

interface MathConstants {
	public static final double PI = Math.PI;// public static final
}

class MathLib2 implements MathConstants {
	public void cal2() {
		double val = PI + 3;

	}
}

class MathLib implements MathConstants {
	public void cal() {
		double val = PI * 3;

	}
}

public class UseOfInterface {

	public static void main(String[] args) {

	}

}
