package com.day3.assignment;

public class TeachingStaff extends Staff{
	private String teachingSubject;
	private int teachingRating;
	private String qualification;
	private boolean phd;
	
	
	
	public TeachingStaff(String name, String address, String deptName, double salary, String teachingSubject,
			int teachingRating, String qualification, boolean phd) {
		super(name, address, deptName, salary);
		
		this.teachingSubject = teachingSubject;
		this.teachingRating = teachingRating;
		this.qualification = qualification;
		this.phd = phd;
	}
	public String getTeachingSubject() {
		return teachingSubject;
	}
	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}
	public int getTeachingRating() {
		return teachingRating;
	}
	public void setTeachingRating(int teachingRating) {
		this.teachingRating = teachingRating;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public boolean isPhd() {
		return phd;
	}
	public void setPhd(boolean phd) {
		this.phd = phd;
	}
	@Override
	public String toString() {
		return  super.toString() +   "TeachingStaff [teachingSubject=" + teachingSubject + ", teachingRating=" + teachingRating
				+ ", qualification=" + qualification + ", phd=" + phd + "]";
	}
	
	
	
}
