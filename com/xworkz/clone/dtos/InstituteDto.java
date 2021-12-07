package com.xworkz.clone.dtos;

public class InstituteDto implements Cloneable{
	private String name;
	private String location;
	private int noOfBranch;
	private int noOfStudents;
	private String mainCourse;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfBranch() {
		return noOfBranch;
	}
	public void setNoOfBranch(int noOfBranch) {
		this.noOfBranch = noOfBranch;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	@Override
	public String toString() {
		return "InstituteDto [name=" + name + ", location=" + location + ", noOfBranch=" + noOfBranch
				+ ", noOfStudents=" + noOfStudents + ", mainCourse=" + mainCourse + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
