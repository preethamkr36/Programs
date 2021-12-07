package com.xworkz.clone.dtos;

public class MobileDto implements Cloneable {
	private String brand;
	private String model;
	private String storage;
	private int price;
	private boolean stock;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "MobileDto [brand=" + brand + ", model=" + model + ", storage=" + storage + ", price=" + price
				+ ", stock=" + stock + "]";
	}
}
