package com.day5.session1;
import static java.lang.Math.*;

// custom ex: checked ex
class NegativeRadiusException extends RuntimeException{
	public NegativeRadiusException(String message) {
		super(message);
	}
}
class Circle{
	private int radius;

	// throw vs throws
	
	// if u are throwing checked ex... then method sign must contain throws
	
	// if u are throwing un-checked ex---- then method sign may or may not contain throws
	//( it depend u , optional)
	
	public Circle(int radius)throws NegativeRadiusException {
		if(radius<=0)
			throw new NegativeRadiusException("radius :"+ radius+" is not possible");
		this.radius = radius;
	}
	public double getArea() {
		return PI* radius* radius;
	}
}

public class DemoCircle {
	
	public static void main(String[] args)  {
		
		//if u are calling an method that throws checekd ex: then try cath is must 
		//if u are calling an method that throws un-checekd ex: then try cath is optional 
		try {
		Circle circle=new Circle(-3);
		System.out.println(circle.getArea());
		}catch(NegativeRadiusException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}









