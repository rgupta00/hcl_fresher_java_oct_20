package com.day3.session1.loosecoupling;
//PS: a passanger named raja moving from Laxmi nagar to 
//Noida using metro

// interface bw two parties
interface Vehical{
	void move(String source , String destination);
}
class Metro implements  Vehical{
	public void move(String source , String destination) {
		System.out.println("moving in metro from :"+ source +" to "+ destination);
	}
}

class Bike implements  Vehical{
	public void move(String source , String destination) {
		System.out.println("moving on the bike from :"+ source +" to "+ destination);
	}
}

class Car implements  Vehical{
	public void move(String source , String destination) {
		System.out.println("moving in car from :"+ source +" to "+ destination);
	}
}

//passange is tightly coupled with car, Metro
//why not Passanger is loosly coupled from the choice of vehical
// why not passanger talk via interface
class Passanger{
	
	private String name;
	
	public Passanger(String name) {
		this.name=name;
	}
	public void travel(String source, String destination, Vehical vehical) {
		vehical.move(source, destination);
	}
}
public class DemoLooseCoupling {
	
	public static void main(String[] args) {
		//Metro metro=new Metro();
		Vehical vehical=new Car();
		Passanger passanger=new Passanger("raja");
		passanger.travel("LN", "Noida", vehical);
	}
}



