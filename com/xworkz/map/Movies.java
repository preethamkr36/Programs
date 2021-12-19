package com.xworkz.map;

import java.util.*;

public class Movies {
	public static void main(String[] args) {
		 Map<String,Double> map=new HashMap<String,Double>();
		 map.put("Showtimes for Garuda Gamana Vrishabha Vahana", 9.1); 
		 map.put("Kgf",8.3);
		 map.put("3 Idiots", 8.4);
		 map.put("Yuvaratna", 6.7);
		 map.put("Bangalore Days", 8.3);
		 map.put("Ugram",8.1);
		 map.put("Chhichhore", 8.3);
		 map.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("----------------------------------");
		 System.out.println("Movie");
		 System.out.println("----------------------------------");
		 Set<String> se=map.keySet();
		 se.forEach((e)-> System.out.println(e) );
		 
		 System.out.println("----------------------------------");
		 System.out.println("Ratings");
		 System.out.println("----------------------------------");
		 Collection<Double> se1=map.values();
		 se1.forEach((e)->System.out.println(e));
		 
		 System.out.println("----------------------------------");
		 System.out.println("Movies with imdb rating");
		 System.out.println("----------------------------------");
		 Collection<Map.Entry<String, Double>> col3=map.entrySet();
		 Iterator<Map.Entry<String, Double>>  itr=col3.iterator();
		 
		 while(itr.hasNext())
		 {
			Map.Entry<String, Double> val3	=itr.next();
			System.out.println(val3);
		 }
		 
		 System.out.println("----------------------------------");
		 System.out.println("Assending order");
		 System.out.println("----------------------------------");
		 Map<String,Double> map1=new TreeMap<String,Double>();
		 map1.put("Kgf",8.3);
		 map1.put("Kotigobba 3", 6.8);
		 map1.put("Kurukshetra", 6.7);
		 map1.put("Yuvaratna", 6.7);
		 map1.put("Bhajarangi2", 8.2);
		 map1.put("Ugram",8.1);
		 map1.put("Sakkath", 8.6);
		 map1.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("----------------------------------");
		 System.out.println("Movies");
		 System.out.println("----------------------------------");
		 Set<String> se3=map1.keySet();
		 se3.forEach((e)-> System.out.println(e) );
		 
		 System.out.println("----------------------------------");
		 System.out.println("Desending order");
		 System.out.println("----------------------------------");
		 Map<String,Double> map2=new TreeMap<String,Double>((e3,e2)->e2.compareTo(e3));
		 map2.put("Kgf",8.3);
		 map2.put("Kotigobba 3", 6.8);
		 map2.put("Kurukshetra", 6.7);
		 map2.put("Yuvaratna", 6.7);
		 map2.put("Bhajarangi2", 8.2);
		 map2.put("Ugram",8.1);
		 map2.put("Sakkath", 8.6);
		 map2.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("----------------------------------");
		 System.out.println("Movies");
		 System.out.println("----------------------------------");
		 Set<String> se4=map2.keySet();
		 se4.forEach((e)-> System.out.println(e) );
	}
}
