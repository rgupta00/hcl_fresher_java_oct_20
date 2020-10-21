package com.day3.session2;

interface Swimable{
	public void swim() ;
}
interface Flyable{
	public void fly() ;
}
class Bird{
	public void sound() {
		System.out.println("some sound of birds...");
	}
	
	public void eat() {
		System.out.println("eat rice, wheat and fruits.");
	}

}


class Emu extends Bird{
	public void eat() {
		System.out.println("eat small insects and very slow to eat!.");
	}
}

class Duck extends Bird implements Swimable{

	@Override
	public void swim() {
		System.out.println("if i am champion i am not less in swimming!");
	}
	
}
class Eagle extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println(" i rock! in flying");
	}
	
}
public class BirdZooProblem {
	
	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.fly();
	}
}









