package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryArrival {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("Afghanistan", 93);
		map.put("Argentina", 54);
		map.put("Brazil", 55);
		map.put("Cambodia", 855);
		map.put("Egypt", 20);
		map.put("India", 91);
		map.put("Ireland", 353);
		map.put("Myanmar", 95);
		
		Integer size = map.size();
		System.out.println(size);
		
		Integer code =map.get("India");
		System.out.println(code);
		code = map.get("Egypt");
		System.out.println(code);
		
		boolean check =map.containsKey("Cambodia");
		System.out.println(check);
		
		check = map.containsValue(91);
		System.out.println(check);
		
		Set<String> check1 =  map.keySet();
		
		check1.forEach((e)-> {System.out.println(e);});
		
		Set<Entry<String, Integer>> check2 = map.entrySet();
		check2.forEach((e)-> System.out.println(e));
	}
}
