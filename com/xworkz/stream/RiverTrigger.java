package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.RiverDto;

public class RiverTrigger {
	public static void main(String[] args) {
		RiverDto dto1=new RiverDto(1, "Ganges", "Uttarakhand", 2510, 24);
		RiverDto dto2=new RiverDto(2, "Brahmaputra", "Arunachal Pradesh", 3848, 17);
		RiverDto dto3=new RiverDto(3, "Yamuna", "Uttarakhand", 1376, 20);
		RiverDto dto4=new RiverDto(4, "Tunga", "Karnataka", 147, 4);
		RiverDto dto5=new RiverDto(5, "Kaveri", "Karnataka", 805, 8);
		
		List<RiverDto> riverList=new ArrayList<RiverDto>();
		riverList.add(dto5);
		riverList.add(dto2);
		riverList.add(dto1);
		riverList.add(dto3);
		riverList.add(dto4);
		
		riverList.stream().filter((dto)->dto.getLength()>400).sorted((d1,d2)->dto1.getNoOfDams().compareTo(dto2.getNoOfDams())).collect(Collectors.toList()).forEach((ele)->System.out.println(ele));;
		System.out.println();
		riverList.stream().filter((dto)->dto.getLength()>400).sorted((d1,d2)->dto2.getNoOfDams().compareTo(dto1.getNoOfDams())).collect(Collectors.toList()).forEach((ele)->System.out.println(ele));;
	}
}