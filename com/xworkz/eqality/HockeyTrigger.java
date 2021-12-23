package com.xworkz.eqality;

import java.util.*;

import com.xworkz.eqality.dto.HockeyDto;

public class HockeyTrigger {
	public static void main(String[] args) {
		HockeyDto dto1 = new HockeyDto(5, 1823, "India");
		HockeyDto dto2 = new HockeyDto(1, 2350, "Australia");
		HockeyDto dto3 = new HockeyDto(3, 2155, "Netherlands");
		HockeyDto dto4 = new HockeyDto(4, 1988, "Argentina");
		HockeyDto dto5 = new HockeyDto(2, 2348, "Belgium");
		HockeyDto dto6 = new HockeyDto(5, 1823, "India");
		HockeyDto dto7 = new HockeyDto(4, 1988, "Argentina");

		Set<HockeyDto> hockeySet = new HashSet<HockeyDto>();
		hockeySet.add(dto7);
		hockeySet.add(dto6);
		hockeySet.add(dto5);
		hockeySet.add(dto4);
		hockeySet.add(dto3);
		hockeySet.add(dto2);
		hockeySet.add(dto1);

		System.out.println(hockeySet.size());

		Optional<HockeyDto> optional = hockeySet.stream().filter((a) -> a.getRank() < 4)
				.sorted((a1, a2) -> a1.getRank().compareTo(a2.getRank())).findFirst();

		System.out.println(optional);
	}
}