package com.day4.session1;
//outer class
class Outer{
	private int i=66;
	
	// inner class
	private class Inner{
		private int i=99;
		public void doInner() {
			System.out.println("do inner of inner class"+ Outer.this.i+": "+ this.i);
		}
	}
	// i can create the object of inner class at 2 location
	//1. inside the outer class
	
	
	//instance method 
	public   void doOuter() {
		// Inner class must be associated with a valid object of outer class (this could be "this" also)
		Inner inner=this.new Inner();
		inner.doInner();
	}
}


public class DemoInnerClass {
	
	public static void main(String[] args) {
		
	}

}
