package com.xworkz.stream.dto;

import java.io.Serializable;

public class CafeDto implements Serializable{
	private Integer id;
	private String name;
	private String location;
	private Float rating;
	public CafeDto(Integer id, String name, String location, Float rating) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CafeDto [id=" + id + ", name=" + name + ", location=" + location + ", rating=" + rating + "]";
	}
}
