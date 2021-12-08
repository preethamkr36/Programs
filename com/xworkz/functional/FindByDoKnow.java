package com.xworkz.functional;

public class FindByDoKnow implements Email{

	@Override
	public boolean search(String valu11, String value2) {
		String s=valu11.substring(valu11.length()-value2.length(), valu11.length());
		if(s.equals(value2)) {
			return true;
		}
		return false;
	}
	
}
