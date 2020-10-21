package a.c;
import a.b.*;

public class Tester extends A{

	public static void main(String[] args) {
		
		Tester a=new Tester();
		System.out.println(a.j);
		a.printPublic();
		
		//default and protected:
		// if an class of other package subclass that (coming from another package) class 
		//then i can access its protected data/method
		
		a.printProtected();
		//a.printDefault();
		
		System.out.println(a.k);
		//System.out.println(a.m);
	}
}
