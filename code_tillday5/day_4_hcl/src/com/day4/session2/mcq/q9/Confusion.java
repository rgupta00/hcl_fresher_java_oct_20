package com.day4.session2.mcq.q9;

class Foo {
	private int i;
	public Foo(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	//@Override
	public boolean equals(Foo obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
	
	
}
public class Confusion {
	public static void main(String[] args) {
		Object f1 = new Foo(22);
		Object f2 = new Foo(22);
		System.out.println(f1.equals(f2));
	}

}