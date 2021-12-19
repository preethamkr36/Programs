package com.xworkz.map;

import java.util.*;

public class Area {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("Basavanagudi","17.76 sqkms");
		map.put("Rajajinagar","7.02 sqkms.");
		map.put("BTM Layout", "2.13sq.km");
		map.put("Majastic", "0.75 sqkms");
		map.put("Yeshwantpura", "7.52 sqkms");
		map.put("Indira Nagar", "3.49 sqkms");
		map.put("Jayanagar", "7.92 sqkms");
		map.put("Koramangala", "6.84 sqkms");
		map.put("Malleshwaram", "3.95 sqkms");
		map.put("Bellundur", "26.4 sqkms");
		
		System.out.println("----------------------------------");
		System.out.println("keys");
		System.out.println("----------------------------------");
		Set<String> se=map.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("----------------------------------");
		System.out.println("values");
		System.out.println("----------------------------------");
		Collection<String> se1=map.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("----------------------------------");
		System.out.println("keys and values");
		System.out.println("----------------------------------");
		Set<Map.Entry<String, String>> se2=map.entrySet();
		Iterator<Map.Entry<String, String>> it=se2.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> val=it.next();
			System.out.println(val);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Asending order");
		System.out.println("----------------------------------");
		Map<String,String> map1=new TreeMap<String,String>();
		map1.put("Basavanagudi","17.76 sqkms");
		map1.put("Rajajinagar","7.02 sqkms.");
		map1.put("BTM Layout", "2.13sq.km");
		map1.put("Majastic", "0.75 sqkms");
		map1.put("Yeshwantpura", "7.52 sqkms");
		map1.put("Indira Nagar", "3.49 sqkms");
		map1.put("Jayanagar", "7.92 sqkms");
		map1.put("Koramangala", "6.84 sqkms");
		map1.put("Malleshwaram", "3.95 sqkms");
		map1.put("Bellundur", "26.4 sqkms");
		
		System.out.println("----------------------------------");
		System.out.println("keys");
		System.out.println("----------------------------------");
		Set<String> se4=map1.keySet();
		se4.forEach((e)->System.out.println(e));

		System.out.println("----------------------------------");
		System.out.println("Desending order");
		System.out.println("----------------------------------");
		Map<String,String> map2=new TreeMap<String,String>((e,e1)->e1.compareTo(e));
		map2.put("Basavanagudi","17.76 sqkms");
		map2.put("Rajajinagar","7.02 sqkms.");
		map2.put("BTM Layout", "2.13sq.km");
		map2.put("Majastic", "0.75 sqkms");
		map2.put("Yeshwantpura", "7.52 sqkms");
		map2.put("Indira Nagar", "3.49 sqkms");
		map2.put("Jayanagar", "7.92 sqkms");
		map2.put("Koramangala", "6.84 sqkms");
		map2.put("Malleshwaram", "3.95 sqkms");
		map2.put("Bellundur", "26.4 sqkms");
		
		System.out.println("----------------------------------");
		System.out.println("keys");
		System.out.println("----------------------------------");
		Set<String> se5=map2.keySet();
		se5.forEach((e)->System.out.println(e));
	}
}