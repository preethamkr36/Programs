package com.xworkz.functional;

public class FindByCom implements Email{

	@Override
	public boolean search(String valu11, String value2) {
		String s1=valu11.substring(valu11.length()-4, valu11.length());
		if(s1.equals(value2)) {
			return true;
		}
		return false;
	}
	
}
