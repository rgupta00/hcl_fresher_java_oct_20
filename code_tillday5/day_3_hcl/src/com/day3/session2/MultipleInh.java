package com.day3.session2;

interface M{
	int i=99;
	public void foof() ;
}

interface N{
	int i=44;
	public void foof();
}

class X implements M,N{
	//we dont care which method is overriden
	public void foof() {
		System.out.println(M.i);
	}
}



public class MultipleInh {
	
	public static void main(String[] args) {
		
	}

}
