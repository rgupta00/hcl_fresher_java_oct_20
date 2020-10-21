package com.day3.assignment;

public class Staff extends Person{
	private String deptName;
	private double salary;
	
	
	public Staff(String name, String address, String deptName, double salary) {
		super(name, address);
		this.deptName = deptName;
		this.salary = salary;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return  super.toString()+     "Staff [deptName=" + deptName + ", salary=" + salary + "]";
	}
	
	
	
	
}
