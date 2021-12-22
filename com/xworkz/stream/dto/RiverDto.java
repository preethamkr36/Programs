package com.xworkz.stream.dto;

import java.io.Serializable;

public class RiverDto implements Serializable{
	private Integer id;
	private String name;
	private String state;
	private Integer length;
	private Integer noOfDams;
	public RiverDto(Integer id, String name, String state, Integer length, Integer noOfDams) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.length = length;
		this.noOfDams = noOfDams;
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
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getNoOfDams() {
		return noOfDams;
	}
	public void setNoOfDams(Integer noOfDams) {
		this.noOfDams = noOfDams;
	}
	@Override
	public String toString() {
		return "RiverDto [id=" + id + ", name=" + name + ", state=" + state + ", length=" + length + ", noOfDams="
				+ noOfDams + "]";
	}
}
