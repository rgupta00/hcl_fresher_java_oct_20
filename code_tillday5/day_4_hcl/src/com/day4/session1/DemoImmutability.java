package com.day4.session1;

import java.util.Arrays;
import java.util.Date;

//steps to create our own immutable objects:
//1. class should be final
//2. all instance variable/static variable should be final and assignened in ctr
//3. dont return the object as it is,  return the copy of the object (otherwise u have side effect)
//4. use clonning for immutable objects
// 5. should not provide setter , even getter should return copy of the object*
class Foo{
	private int i;

	public Foo(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Foo [i=");
		builder.append(i);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
final class MyImmutableClass{
	private final int temp;
	private final String name;
	private final Date date;
	private final int []arr;
	private final Foo foo;
	public MyImmutableClass(int temp, String name, Date date, int[] arr, Foo foo) {
		super();
		this.temp = temp;
		this.name = name;
		this.date = (Date) date.clone();
		this.arr = Arrays.copyOf(arr, arr.length);
		this.foo = new Foo(foo.getI());
	}
	public int getTemp() {
		return temp;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return (Date) date.clone();
	}
	public int[] getArr() {
		return Arrays.copyOf(arr, arr.length);
	}
	public Foo getFoo() {
		return new Foo(foo.getI());
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyImmutableClass [temp=");
		builder.append(temp);
		builder.append(", name=");
		builder.append(name);
		builder.append(", date=");
		builder.append(date);
		builder.append(", arr=");
		builder.append(Arrays.toString(arr));
		builder.append(", foo=");
		builder.append(foo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}


public class DemoImmutability {

	public static void main(String[] args) {
		
		String name="raj";
		
		Date date=new Date();
		int arr[]= {3,5,6,9};
		Foo foo=new Foo(44);
			
		MyImmutableClass ob=new MyImmutableClass(32, name, date, arr, foo);
		
		System.out.println(ob);
		//arr[2]=444;
		//foo.setI(7778);
		
		date.setDate(date.getDate()+2);
		
		System.out.println("-------------------------");
		System.out.println(ob);
		
		int arrTemp[]=ob.getArr();
		arrTemp[1]=666;
		
		System.out.println(ob);
//		int arr[]= {3,5,7};
//		int temp[]=copyOfArray(arr);
//		
//		arr[2]=999;
//		for(int t: temp)
//			System.out.println(t);
	}

//	private static int[] copyOfArray(int[] arr) {
//		return Arrays.copyOf(arr, arr.length);
//	}
}
