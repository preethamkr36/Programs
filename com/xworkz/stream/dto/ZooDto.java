package com.xworkz.stream.dto;

import java.io.Serializable;

public class ZooDto implements Serializable{
	private Integer id;
	private String name;
	private String state;
	private Integer price;
	public ZooDto(Integer id, String name, String state, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ZooDto [id=" + id + ", name=" + name + ", state=" + state + ", price=" + price + "]";
	}
}
