package com.xworkz.map;

import java.util.*;

public class Months {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String, Integer>();
		m.put("Janaury", 31);
		m.put("Febraury", 28);
		m.put("March", 31);
		m.put("April", 30);
		m.put("May", 31);
		m.put("June", 30);
		m.put("July", 31);
		m.put("August", 31);
		m.put("September", 30);
		m.put("October", 31);
		m.put("November", 30);
		m.put("December", 31);
		
		System.out.println("--------------------------------------");
		System.out.println("Months");
		System.out.println("--------------------------------------");
		Set<String> se=m.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("--------------------------------------");
		System.out.println("Number of days");
		System.out.println("--------------------------------------");
		Collection<Integer> se1=m.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("--------------------------------------");
		System.out.println("Month and No of days");
		System.out.println("--------------------------------------");
		Set<Map.Entry<String, Integer>> se2=m.entrySet();
		Iterator<Map.Entry<String, Integer>> it=se2.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String, Integer> val3=it.next();
			System.out.println(val3);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Assending order");
		System.out.println("--------------------------------------");
		Map<String,Integer> map2=new TreeMap<String, Integer>();
		
		
		map2.put("Janaury", 31);
		map2.put("Febraury", 28);
		map2.put("March", 31);
		map2.put("April", 30);
		map2.put("May", 31);
		map2.put("June", 30);
		map2.put("July", 31);
		map2.put("August", 31);
		map2.put("September", 30);
		map2.put("October", 31);
		map2.put("November", 30);
		map2.put("December", 31);
		
		System.out.println("--------------------------------------");
		System.out.println("Months");
		System.out.println("--------------------------------------");
		Set<String> se4=map2.keySet();
		se4.forEach((e)->System.out.println(e));
		
		
		System.out.println("--------------------------------------");
		System.out.println("Desending order");
		System.out.println("--------------------------------------");
		Map<String,Integer> map3=new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		
		
		map3.put("Janaury", 31);
		map3.put("Febraury", 28);
		map3.put("March", 31);
		map3.put("April", 30);
		map3.put("May", 31);
		map3.put("June", 30);
		map3.put("July", 31);
		map3.put("August", 31);
		map3.put("September", 30);
		map3.put("October", 31);
		map3.put("November", 30);
		map3.put("December", 31);
		
		System.out.println("--------------------------------------");
		System.out.println("Months");
		System.out.println("--------------------------------------");
		Set<String> se5=map3.keySet();
		se5.forEach((e)->System.out.println(e));
	}

}
