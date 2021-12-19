package com.xworkz.map;

import java.util.*;
import java.util.Map.Entry;

public class States {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("karnataka", 31);
		map.put("AndraPradesh", 13);
		map.put("Nagaland", 12);
		map.put("Punjab", 23);
		map.put("MadyaPradesh", 55);
		map.put("Tamilnadu", 38);
		map.put("Uttar pradesh", 71);
		map.put("sikkim", 4);
		map.put("Maharastra", 36);
		map.put("Goa", 4);
		
		System.out.println("----------------------------------");
		System.out.println("States");
		System.out.println("----------------------------------");
		Set<String> se=map.keySet();
		se.forEach((e)-> System.out.println(e) );
		 
		System.out.println("----------------------------------");
		System.out.println("No Of Districts");
		System.out.println("----------------------------------");
		Collection<Integer> se1=map.values();
		se1.forEach((e)->System.out.println(e));
		 
		System.out.println("----------------------------------");
		System.out.println("States with No Of Districts");
		System.out.println("----------------------------------");
		Collection<Entry<String, Integer>> col3=map.entrySet();
		Iterator<Entry<String, Integer>>  itr=col3.iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> val3	=itr.next();
			System.out.println(val3);
		}
		 
		System.out.println("----------------------------------");
		System.out.println("Assending order");
		System.out.println("----------------------------------");
		Map<String,Integer> map1=new TreeMap<>();
		map1.put("karnataka", 31);
		map1.put("AndraPradesh", 13);
		map1.put("Nagaland", 12);
		map1.put("Punjab", 23);
		map1.put("MadyaPradesh", 55);
		map1.put("Tamilnadu", 38);
		map1.put("Uttar pradesh", 71);
		map1.put("sikkim", 4);
		map1.put("Maharastra", 36);
		map1.put("Goa", 4);
		
		System.out.println("----------------------------------");
		System.out.println("States");
		System.out.println("----------------------------------");
		Set<String> se3=map1.keySet();
		se3.forEach((e)-> System.out.println(e) );
		
		System.out.println("----------------------------------");
		System.out.println("Desending order");
		System.out.println("----------------------------------");
		Map<String,Integer> map2=new TreeMap<>((e3,e2)->e2.compareTo(e3));
		map2.put("karnataka", 31);
		map2.put("AndraPradesh", 13);
		map2.put("Nagaland", 12);
		map2.put("Punjab", 23);
		map2.put("MadyaPradesh", 55);
		map2.put("Tamilnadu", 38);
		map2.put("Uttar pradesh", 71);
		map2.put("sikkim", 4);
		map2.put("Maharastra", 36);
		map2.put("Goa", 4);
		
		System.out.println("----------------------------------");
		System.out.println("States");
		System.out.println("----------------------------------");
		Set<String> se4=map2.keySet();
		se4.forEach((e)-> System.out.println(e) );
	}
}