package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.CafeDto;

public class CafeTrigger {

	public static void main(String[] args) {
		CafeDto dto1=new CafeDto(10,"Dyu Art Cafe","Banglore",4.1f);
		CafeDto dto2=new CafeDto(20,"Cafe Max","Delhi",4.3f);
		CafeDto dto3=new CafeDto(30,"CafeTree","Mudhol",3.1f);
		CafeDto dto4=new CafeDto(40,"Cafe Noir","Banglore",3.0f);
		CafeDto dto5=new CafeDto(50,"McDonalds","Hubli",4.0f);
		
		List<CafeDto> cafeList=new ArrayList<CafeDto>();
		cafeList.add(dto1);
		cafeList.add(dto2);
		cafeList.add(dto3);
		cafeList.add(dto4);
		cafeList.add(dto5);
		
		cafeList.stream().filter((dto)->dto.getRating()>3).sorted((d1,d2)->d1.getName().compareTo(d2.getName())).collect(Collectors.toList()).forEach((ele)->System.out.println(ele));
	}

}
