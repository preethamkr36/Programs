package com.xworkz.clone.dtos;

public class StadiumsDto implements Cloneable {
	private String name;
	private String location;
	private int capacity;
	private int noOfGates;
	
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getNoOfGates() {
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "StadiumsDto [name=" + name + ", location=" + location + ", capacity=" + capacity + ", noOfGates="
				+ noOfGates + "]";
	}
}
