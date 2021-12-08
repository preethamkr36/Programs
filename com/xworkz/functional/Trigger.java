package com.xworkz.functional;

import java.util.Scanner;

public class Trigger {
	public static void main(String[] args) {
		DAO dao=new DAO();
		
		dao.save("preethamkr36@gmail.com");
		dao.save("preethamkr.xworkz@gmail.com");
		dao.save("preethamkr.xworkz@gmail.in");
		
		Email email1=new FindByEmail();
		
		System.out.println(dao.find(email1, "preethamkr@gmail.com"));
		
		Email email2=new FindByCom();
				
		System.out.println(dao.find(email2, ".com"));
		
		Email email3=new FindByIn();
		
		System.out.println(dao.find(email3, ".in"));
		
		System.out.println("Enter what to search .in or .com");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Email email4=new FindByDoKnow();
		
		System.out.println(dao.find(email4, s));
	}
}
