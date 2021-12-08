package com.xworkz.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DAO {
	Collection<String> coll=new ArrayList<String>();
	
	public boolean save(String id) {
		return coll.add(id);
	}
	
	public boolean find(Email email,String value) {
		Iterator<String> itr=coll.iterator();
		while (itr.hasNext()) {
			String temp =itr.next();
			if(email.search(temp, value)) {
				return true;
			}
		}
		return false;
	}
}
