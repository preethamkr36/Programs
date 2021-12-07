package com.xworkz.clone.dtos;

public class PenDto implements Cloneable {
	private String brand;
	private int price;
	private String type;
	private String ink;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInk() {
		return ink;
	}
	public void setInk(String ink) {
		this.ink = ink;
	}
	@Override
	public String toString() {
		return "PenDto [brand=" + brand + ", price=" + price + ", type=" + type + ", ink=" + ink + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
