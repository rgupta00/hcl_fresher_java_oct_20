package a.b;
import java.util.*;

import java.sql.*;
import javax.sql.*;

public class A {
	private int i=8;
	public int j=55;
	protected int k=99;
	int m=55;
	public void printPublic() {
		System.out.println("i am a public method of class A");
	}
	protected void printProtected() {
		System.out.println("i am a protected method of class A");
	}
	 void printDefault() {
		System.out.println("i am a default method of class A");
	}
	
	private void printPrivate() {
		System.out.println("i am a private method of class A");
	}
	
}
