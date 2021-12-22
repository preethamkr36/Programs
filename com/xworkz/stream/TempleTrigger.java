package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.TempleDto;

public class TempleTrigger {
	public static void main(String[] args) {
		TempleDto dto1=new TempleDto(1, "Vittala Temple", "Hampi", "Virupakhsa", 5100);
		TempleDto dto2=new TempleDto(2, "Udupi Shri Krishna", "Udupi", "Krishna", 7000);
		TempleDto dto3=new TempleDto(3, "Vidya Shankara Temple", "Shringeri", "Sharada", 4000);
		TempleDto dto4=new TempleDto(4, "Iskon", "Bangalore", "Krishna", 7500);
		TempleDto dto5=new TempleDto(5, "Dharmastala", "South canara", "Manjunatha Swamy", 6000);
		
		List<TempleDto> templeList=new ArrayList<TempleDto>();
		templeList.add(dto4);
		templeList.add(dto1);
		templeList.add(dto3);
		templeList.add(dto5);
		templeList.add(dto2);
		
		templeList.stream().filter((dto)->dto.getVisitors()>5000).sorted((d1,d2)->d2.getVisitors().compareTo(d1.getVisitors())).collect(Collectors.toList()).forEach((ele)->System.out.println(ele));
	}
}
