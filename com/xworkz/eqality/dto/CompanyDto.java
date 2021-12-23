package com.xworkz.eqality.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable {
	private Integer id;
	private String name;
	private String ceo;
	private Double turnOver;

	public CompanyDto(Integer id, String name, String ceo, Double turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.turnOver = turnOver;
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

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public Double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", name=" + name + ", ceo=" + ceo + ", turnOver=" + turnOver
				+ " USD Millions ]";
	}

	@Override
	public int hashCode() {
		return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyDto) {
				CompanyDto tempDto = (CompanyDto) obj;
				if (this.getId().equals(tempDto.getId())) {
					return true;
				}
			}
		}
		return false;
	}
}