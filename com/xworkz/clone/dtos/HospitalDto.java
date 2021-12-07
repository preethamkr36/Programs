package com.xworkz.clone.dtos;

public class HospitalDto implements Cloneable {
	private String name;
	private String location;
	private int noOfPatients;
	private int noOfWards;
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
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	public int getNoOfWards() {
		return noOfWards;
	}
	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}
	@Override
	public String toString() {
		return "HospitalDto [name=" + name + ", location=" + location + ", noOfPatients=" + noOfPatients
				+ ", noOfWards=" + noOfWards + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
