package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LaptopArrival {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("HP", "14 Q-cs0017TU");
		map.put("Lenovo", "ideapad slim 5");
		map.put("Dell", "Inspiron");
		map.put("Acer", "Aspire 7");
		
		String check = map.get("HP");
		System.out.println(check);
		
		boolean contain = map.containsKey("Dell");
		System.out.println(contain);
		
		contain = map.containsValue("Inspiron");
		System.out.println(contain);
		
		Set<String> check1 = map.keySet();
		check1.forEach((e)->System.out.println(e));
		
		Set<Entry<String, String>> check2 = map.entrySet();
		check2.forEach((e)->System.out.println(e));
	}
}
