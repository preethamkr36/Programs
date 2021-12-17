package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AadharArrival {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(519624487836L, "Rohith");
		map.put(345345336584L, "Raghav");
		map.put(344258736412L, "Ravi");
		map.put(234572208423L, "Ramesh");
		
		String check = map.get(421422208423L);
		System.out.println(check);
		
		boolean contain = map.containsKey(234572208423L);
		System.out.println(contain);
		
		contain = map.containsValue("Ravi");
		System.out.println(contain);
		
		Set<Long> check1 = map.keySet();
		check1.forEach((e)->System.out.println(e));
		
		Set<Entry<Long,String>> check2 = map.entrySet();
		check2.forEach((e)-> System.out.println(e));
	}
}
