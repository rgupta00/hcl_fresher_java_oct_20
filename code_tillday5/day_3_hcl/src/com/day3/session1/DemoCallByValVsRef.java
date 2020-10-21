package com.day3.session1;
class Val{
	private int i;
	
	public Val(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
public class DemoCallByValVsRef {
	
	public static void main(String[] args) {
		// call by value and call by ref
		
		Val val1=new Val(10);
		Val val2=new Val(20);
		
		//System.out.println("before swapping: val1:"+val1.getI() +" value of val2: "+val2.getI() );
		
		// we are passing the copy of the varaible ie i and j
		// we are actually passing the copy of the ref!
		System.out.println("val1:" + val1.getI());
		myMethod(val1);
		System.out.println("val1:" + val1.getI());
		//swap(val1, val2);
		//System.out.println("after swapping: val1:"+val1.getI() +" value of val2: "+val2.getI() );
		

		//Java do not support call by ref vs C++ it support both
		//Why java dont suppor it ie call by ref : 
		//java dont want that you should misuse the object in called mehtod?
	}

	private static void myMethod(Val val1) {
		val1.setI(30);
		//val1=null;
	}

	private static void swap(Val val1, Val val2) {
		Val temp=val1;
		val1=val2;
		val2=temp;
	}

	

}




