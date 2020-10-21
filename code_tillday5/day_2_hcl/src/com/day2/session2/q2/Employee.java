package com.day2.session2.q2;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(int id, String firstName, String lastName, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	public double getSalary() {
		return salary;
	}

	// 1-100
	/*
	 * 20000 + 2000*2
	 */
	public void getRaisedSalary(int percentage) {
		// validation is imp
		if (!(percentage < 0 || percentage > 50))
			salary = salary + salary * percentage / 100;
	}

	public void printEmployeeDetails() {
		System.out.println("Emp details: " + "name : " + getFullName() + " salary: " + getSalary());
	}
}
