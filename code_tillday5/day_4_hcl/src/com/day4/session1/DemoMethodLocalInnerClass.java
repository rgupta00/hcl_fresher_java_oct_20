package com.day4.session1;

class A{
	
	public void foof() {
		
		 int i=9;//effectively final ie java is assuming it as a final
		
		// method local inner class can use local variable of that method where it is defined 
		//but there is a condtion , that it should be "final"
		// Java 1.7, Java 1.8
		
		class B{
			public void someSecretLogic() {
				System.out.println("some key logic that should not be expose to the world!"+i);
			}
		}
		
		B b=new B();
		b.someSecretLogic();
	}
	
	public void foof2() {
		
	}
}

public class DemoMethodLocalInnerClass {
	
	public static void main(String[] args) {
		//raju
		A a=new A();
		a.foof();
	}

}










