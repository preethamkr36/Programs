package com.xworkz.eqality;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.eqality.dto.CompanyDto;

public class CompanyTrigger {
	public static void main(String[] args) {
		CompanyDto dto1 = new CompanyDto(1001, "Walmart", "Krish Iyer", 559151d);
		CompanyDto dto2 = new CompanyDto(1015, "Toyota", "Akio Toyoda", 256722d);
		CompanyDto dto3 = new CompanyDto(1027, "Amazon", "Andy Jassy", 386064d);
		CompanyDto dto4 = new CompanyDto(1102, "Apple", "Tim Cook", 365820d);
		CompanyDto dto5 = new CompanyDto(1250, "Volkswagen", "Herbert Diess", 253965d);
		CompanyDto dto6 = new CompanyDto(1102, "Apple", "Tim Cook", 365820d);
		CompanyDto dto7 = new CompanyDto(1015, "Toyota", "Akio Toyoda", 256722d);

		Set<CompanyDto> companySet = new LinkedHashSet<CompanyDto>();
		companySet.add(dto7);
		companySet.add(dto2);
		companySet.add(dto1);
		companySet.add(dto3);
		companySet.add(dto5);
		companySet.add(dto4);
		companySet.add(dto6);

		System.out.println(companySet.size());
		Optional<CompanyDto> optional = companySet.stream().filter((a) -> a.getTurnOver() > 300000d)
				.sorted((a1, a2) -> a1.getTurnOver().compareTo(a2.getTurnOver())).findFirst();
		System.out.println(optional);
	}
}