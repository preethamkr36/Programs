package com.xworkz.stream.dto;

import java.io.Serializable;

public class TempleDto implements Serializable{
	private Integer id;
	private String name;
	private String location;
	private String mainGod;
	private Integer visitors;
	public TempleDto(Integer id, String name, String location, String mainGod, Integer visitors) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.visitors = visitors;
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
	public String getMainGod() {
		return mainGod;
	}
	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}
	public Integer getVisitors() {
		return visitors;
	}
	public void setVisitors(Integer visitors) {
		this.visitors = visitors;
	}
	@Override
	public String toString() {
		return "TempleDto [id=" + id + ", name=" + name + ", location=" + location + ", mainGod=" + mainGod
				+ ", visitors=" + visitors + "]";
	}
}
