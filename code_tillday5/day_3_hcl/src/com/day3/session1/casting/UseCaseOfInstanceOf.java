package com.day3.session1.casting;

class Animal {
	public void sound() {
		System.out.println("dont know how it sound");
	}

}

class Cat extends Animal {
	public void sound() {
		System.out.println(" meou...");

	}

}

class Dog extends Animal {
	public void sound() {
		System.out.println(" bho bho..");
	}

	public void nightWatchDog() {
		System.out.println("jagte raho...");
	}

}

public class UseCaseOfInstanceOf {

	public static void main(String[] args) {
		Animal []animals= {new Dog(), new Cat(), new Dog(), new Dog(),new Cat()};
		
		for(Animal animal: animals) {
			animal.sound();
			if(animal instanceof Dog)
			((Dog) animal).nightWatchDog();
		}
		
	}

}












