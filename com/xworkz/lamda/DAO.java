package com.xworkz.lamda;

import java.util.*;

public class DAO {
	Collection<PresidentDTO> list=new ArrayList<PresidentDTO>();
	
	public boolean save(PresidentDTO dto) {
		return list.add(dto);
	}
	
	public boolean find(PresidentSearch pre, String ele) {
		for (PresidentDTO presidentDTO : list) {
			if(pre.search(presidentDTO, ele)) {
				return true;
			}
		}
		return false;
	}
}
