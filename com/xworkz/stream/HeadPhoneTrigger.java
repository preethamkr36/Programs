package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.HeadPhoneDto;

public class HeadPhoneTrigger {
	public static void main(String[] args) {
		HeadPhoneDto dto1=new HeadPhoneDto(1, "Redmi", "Wireless", "21005R", 1400);
		HeadPhoneDto dto2=new HeadPhoneDto(2, "Realme", "Wireless", "Qbuds130", 1500);
		HeadPhoneDto dto3=new HeadPhoneDto(3, "Samsung Galaxy", "Wired", "32773", 1100);
		HeadPhoneDto dto4=new HeadPhoneDto(4, "Boat", "Wireless", "Rocker v245", 1200);
		HeadPhoneDto dto5=new HeadPhoneDto(5, "Fastrack", "Wireless", "6654", 1800);
		
		List<HeadPhoneDto> headPhonelist=new ArrayList<HeadPhoneDto>();
		headPhonelist.add(dto5);
		headPhonelist.add(dto3);
		headPhonelist.add(dto4);
		headPhonelist.add(dto1);
		headPhonelist.add(dto2);
		
		headPhonelist.stream().sorted((d1,d2)->d1.getId().compareTo(d2.getId())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
		System.out.println();
		headPhonelist.stream().sorted((d1,d2)->d1.getBrand().compareTo(d2.getBrand())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
		System.out.println();
		headPhonelist.stream().filter((dto)->dto.getType().equals("Wireless")).map((a)->a.getModel()).collect(Collectors.toList()).forEach((e)->System.out.println(e));
	}
}
