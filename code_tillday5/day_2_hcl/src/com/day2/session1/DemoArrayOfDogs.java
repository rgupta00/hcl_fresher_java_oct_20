package com.day2.session1;

public class DemoArrayOfDogs {

	public static void main(String[] args) {
		// it is a array that can hold 5 dogs, but no dog right now!
//		Dog []dogs=new Dog[5];
//		dogs[0]=new Dog("black");
//		dogs[1]=new Dog("whilte");
//		dogs[2]=new Dog("brown");
//		dogs[3]=new Dog("reddish");
//		dogs[4]=new Dog("white");
		
		Dog []dogs= {new Dog("white"), new Dog("black")};
		
		for(Dog dog: dogs) {
			dog.brak();
		}
		
	}
}
