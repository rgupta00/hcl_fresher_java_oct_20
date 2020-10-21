package com.day2.session2.q2;

public class EmployeeTester {
	
	public static void main(String[] args) {
		Employee employee=new Employee(121, "raj", "sharma", 1000);
		
		employee.printEmployeeDetails();
		
		System.out.println("its time to get more salary......");
		
		
		employee.getRaisedSalary(40);
		
		employee.printEmployeeDetails();
		
	}

}
