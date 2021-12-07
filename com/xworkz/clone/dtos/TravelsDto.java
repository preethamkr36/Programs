package com.xworkz.clone.dtos;

public class TravelsDto implements Cloneable {
	private String name;
	private String owner;
	private int noOfBus;
	private int foundedIn;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNoOfBus() {
		return noOfBus;
	}
	public void setNoOfBus(int noOfBus) {
		this.noOfBus = noOfBus;
	}
	public int getFoundedIn() {
		return foundedIn;
	}
	public void setFoundedIn(int foundedIn) {
		this.foundedIn = foundedIn;
	}
	@Override
	public String toString() {
		return "TravelsDto [name=" + name + ", owner=" + owner + ", noOfBus=" + noOfBus + ", foundedIn=" + foundedIn
				+ "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
