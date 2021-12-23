package com.xworkz.eqality.dto;

import java.io.Serializable;

public class HockeyDto implements Serializable {
	private Integer rank;
	private Integer points;
	private String country;

	public HockeyDto(Integer rank, Integer points, String country) {
		super();
		this.rank = rank;
		this.points = points;
		this.country = country;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "HokeyDto [rank=" + rank + ", points=" + points + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return this.getRank();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HockeyDto) {
				HockeyDto tempDto = (HockeyDto) obj;
				if (this.getCountry().equals(tempDto.getCountry())) {
					return true;
				}
			}
		}
		return false;
	}
}