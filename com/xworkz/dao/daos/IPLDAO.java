package com.xworkz.dao.daos;

import java.util.*;
public class IPLDAO {
	Collection<String> collection=new ArrayList<String>();
	
	public boolean save(String team) {
		return collection.add(team);
	}
	
	public boolean find(String team) {
		return collection.contains(team);
	}
	
	public boolean findCaseInSensitive(String team) {
		Iterator<String> itr=collection.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if(temp.equalsIgnoreCase(team)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findCaseInSensitiveAndTrim(String team) {
		Iterator<String> itr=collection.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			temp=temp.replace(" ", "");
			if(temp.equalsIgnoreCase(team.replace(" ", ""))) {
				return true;
			}
		}
		return false;
	}
}
