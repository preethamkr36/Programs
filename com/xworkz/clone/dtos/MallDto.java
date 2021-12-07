package com.xworkz.clone.dtos;

public class MallDto implements Cloneable {
	private String name;
	private String location;
	private int noOfShops;
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
	public int getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}
	public int getNoOfGates() {
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	@Override
	public String toString() {
		return "MallDto [name=" + name + ", location=" + location + ", noOfShops=" + noOfShops + ", noOfGates="
				+ noOfGates + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}