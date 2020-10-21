package com.day3.session2.ex25;
//funda of static 

class Student{
	private int id;
	private String name;
	
	private static int counter=0;
	public Student( String name) {
		this.id = ++counter;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static int getCounter() {
		return counter;
	}
}
public class ConfusionOnStatic {
	
	public static void main(String[] args) {
		Student student=new Student("raja");
		Student student2=new Student("amit");
		Student student3=new Student("ekta");
		Student student4=new Student("seema");
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println(Student.getCounter());
		
		
	}

}
