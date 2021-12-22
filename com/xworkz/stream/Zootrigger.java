package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.ZooDto;

public class Zootrigger {
	public static void main(String[] args) {
		ZooDto dto1=new ZooDto(1, "Sri Chamarajendra Zoological Gardens", "Mysore", 200);
		ZooDto dto2=new ZooDto(2, "Nehru Zoological Park", "Hyderabad", 150);
		ZooDto dto3=new ZooDto(3, "National Zoological Park", "New Delhi", 250);
		ZooDto dto4=new ZooDto(4, "Nandankanan Zoological Park", "Odisha", 150);
		ZooDto dto5=new ZooDto(5, "Jaipur zoo", "Jaipur", 250);
		
		List<ZooDto> zooList=new ArrayList<ZooDto>();
		zooList.add(dto3);
		zooList.add(dto1);
		zooList.add(dto5);
		zooList.add(dto2);
		zooList.add(dto4);
		
		zooList.stream().sorted((ele1,ele2)->ele1.getPrice().compareTo(ele2.getPrice())).collect(Collectors.toList()).forEach((zoo)->System.out.println(zoo));
	}
}