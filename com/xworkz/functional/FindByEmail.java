package com.xworkz.functional;

public class FindByEmail implements Email {

	@Override
	public boolean search(String value1, String value2) {
		if(value1.equalsIgnoreCase(value2)) {
			return true;
		}
		return false;
	}
}
