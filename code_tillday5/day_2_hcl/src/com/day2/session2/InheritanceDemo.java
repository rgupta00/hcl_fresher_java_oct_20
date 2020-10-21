package com.day2.session2;

class A{
	private int i;
	// default ctr
	public A() {
		super();
	}
	
	public A(int i) {
		super();
		this.i=i;
	}
	public void print() {
		System.out.println("i:"+i);
	}
}
class B extends A{
	private int j;
	// default ctr
	public B() {}
	
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	public void print() {
		super.print();// reusablity of code!
		System.out.println("j:"+j);
	}
}

class C extends B{
	private int k;
	// default ctr
	public C() {}
	
	public C(int i, int j, int k) {
		super(i,j);
		this.k=k;
	}
	public void print() {
		super.print();// reusablity of code!
		System.out.println("k:"+k);
	}
}
public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		C c=new C(3,4,5);
		c.print();
	}

}





