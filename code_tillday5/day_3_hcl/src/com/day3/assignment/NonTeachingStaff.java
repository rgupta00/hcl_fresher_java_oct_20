package com.day3.assignment;

public class NonTeachingStaff extends Staff{

	private String skill;

	public NonTeachingStaff(String name, String address, String deptName, double salary, String skill) {
		super(name, address, deptName, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return  super.toString()+   " NonTeachingStaff [skill=" + skill + "]";
	}
	
	
	
}
