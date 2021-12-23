package com.xworkz.eqality.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
	private Integer id;
	private String name;
	private String type;
	private Integer price;
	private Short quantity;

	public ProductDto(Integer id, String name, String type, Integer price, Short quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ProductDto) {
				ProductDto tempDto = (ProductDto) obj;
				if (this.getId().equals(tempDto.getId())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
