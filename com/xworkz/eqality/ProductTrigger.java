package com.xworkz.eqality;

import java.util.*;

import com.xworkz.eqality.dto.ProductDto;

public class ProductTrigger {
	public static void main(String[] args) {
		ProductDto dto1 = new ProductDto(201, "Specs", "Specs", 3000, (short) 2);
		ProductDto dto2 = new ProductDto(311, "Mobile", "Electronics", 30000, (short) 1);
		ProductDto dto3 = new ProductDto(125, "Shoes", "Footwear", 1200, (short) 3);
		ProductDto dto4 = new ProductDto(540, "T Shirt", "Fashion", 500, (short) 5);
		ProductDto dto5 = new ProductDto(540, "T Shirt", "Fashion", 500, (short) 5);
		ProductDto dto6 = new ProductDto(401, "Laptop", "Electroins", 50000, (short) 1);

		Set<ProductDto> productSet = new HashSet<ProductDto>();
		productSet.add(dto6);
		productSet.add(dto5);
		productSet.add(dto4);
		productSet.add(dto1);
		productSet.add(dto2);
		productSet.add(dto3);

		System.out.println(productSet.size());

		Optional<ProductDto> optional = productSet.stream().sorted((a1, a2) -> a2.getPrice().compareTo(a1.getPrice()))
				.findFirst();
		System.out.println(optional);
	}
}
