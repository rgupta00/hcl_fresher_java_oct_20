package com.day4.session1;
// Cloneable is a marker interface used to act as a flat

//it tell jvm be ready for clonning!

class Emp implements Cloneable {
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Emp() {
	}

	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)// and this can not be null otherwise we must have NPEx
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Emp temp = (Emp) obj;

		if (this.getId() != temp.getId())
			return false;
		if (this.name == null) {
			if (temp.name != null)
				return false;
		} else if (!this.name.equals(temp.name)) {
			return false;
		}
		// if(this.salary!=temp.salary): this is a bad code!
		// either use bigdecimal class: is more accurate in calculations
		// with double : precison!
		if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(temp.salary))
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize is called...");
		super.finalize();
	}

}

public class DemoNeedOfOverridingEqualsMethod {

	public static void main(String[] args) throws CloneNotSupportedException {

		Emp emp1 = new Emp(121, "RAJA", 3000);

		emp1 = null;

		// Runtime.getRuntime().gc();
		System.gc();

//		
//		empProcess(emp1);
//		
//		Emp emp2=(Emp) emp1.clone();
//		
//		
//		System.out.println(emp1);
//		System.out.println(emp2);
//		
//		

		// getClass() used to get fully qualified name of the class

		// Object emp1 = new Emp(121, "RAJA", 3000);
		// Object emp2 = new Emp(121, "RAJA", 3000);

//		Class c1=emp1.getClass();
//		Class c2=emp2.getClass();
//		
//		System.out.println(c1);
//		System.out.println(c2);

		/*
		 * 
		 * 
		 * String a="hello"; String b="hello"; if(a.equals(b)) {
		 * System.out.println("equals"); }else System.out.println("not eq");
		 */

//		Object emp1 = new Emp(121, "RAJA", 3000);
//		Object emp2 = new Emp(121, "RAJA", 3000);
//
//		if (emp1.equals(emp2))
//			System.out.println("are eq");
//		else
//			System.out.println("are not eq");

	}

	private static void empProcess(Emp emp1) {
		// TODO Auto-generated method stub

	}

}
