package com.day3.session2.ex25;

//Need of final method arguments!
class Emp{
	private int id;
	private String name;
	private double salary;
	private double tax;
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
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Emp(int id, String name, double salary, double tax) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.tax = tax;
	}
	public Emp() {}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", tax=" + tax + "]";
	}
	
	
	
}
class EmployeeSalaryProceesingSystem{
	// we are saying to java ! hey java emp pointer is final, it can not be change
	//but object that is pointed by that pointer can be change
	public void processSalary(final Emp emp) {
		emp.setSalary(emp.getSalary()-2000);
	}
}




/*
 class ImpClass {
	 final int i=9;
	 
	final public void impLogic() {
		//System.out.println(i++);
		///
	}

	public void impLogic2() {
		////
	}
}
class FresherClass extends ImpClass{
	public void impLogic2() {
		this.impLogic();
	}
}
*/
public class DemoFinalKB {

	public static void main(String[] args) {

	}

}
