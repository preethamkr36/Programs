package com.xworkz.dao;

import com.xworkz.dao.daos.*;

public class Trigger {
	public static void main(String[] args) {
		
		GymDAO dao1=new GymDAO();
		
		dao1.save("Golden Gym");
		dao1.save("Strong Gym");
		dao1.save("Stay Fit Gym");
		dao1.save("Ss Gym");
		
		System.out.println(dao1.find("Ss Gym"));
		System.out.println(dao1.findCaseInSensitive("ss gym"));
		System.out.println(dao1.findCaseInSensitiveAndTrim("s sgym")+"\n");
		
		IPLDAO dao2=new IPLDAO();
		
		dao2.save("Royal Challengers Bengaluru");
		dao2.save("Mumbai Indians");
		dao2.save("Rajasthan Royals");
		
		System.out.println(dao2.find("Royal Challengers Bengaluru"));
		System.out.println(dao2.findCaseInSensitive("royal challengers bengaluru"));
		System.out.println(dao2.findCaseInSensitiveAndTrim("royalChallengersbengaluru")+"\n");
		
		PGDAO dao3=new PGDAO();
		
		dao3.save("Sai Deep PG");
		dao3.save("Manjunath PG");
		dao3.save("Ganesh PG");
		
		System.out.println(dao3.find("Sai Deep PG"));
		System.out.println(dao3.findCaseInSensitive("sai deep pg"));
		System.out.println(dao3.findCaseInSensitiveAndTrim("saideeppG")+"\n");
		
		RTODAO dao4=new RTODAO();
		
		dao4.save("KA 14 R 9656");
		dao4.save("KA 18 S 6363");
		dao4.save("KA 01 Q 2335");
		dao4.save("KA 05 P 8226");
		
		System.out.println(dao4.find("KA 05 P 8226"));
		System.out.println(dao4.findCaseInSensitive("kA 05 p 8226"));
		System.out.println(dao4.findCaseInSensitiveAndTrim("KA 05p8226")+"\n");
	}
}
