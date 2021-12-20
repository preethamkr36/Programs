package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYearTrigger {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1999,1998,1997,1996,2005,2004,1999,2000,2001,2002,2001,2003,2004,1998,1997,1996,1999,1998,2000,2000,2001);
		List<Integer> list=stream.filter((year)->year>1999).sorted().collect(Collectors.toList());
		list.forEach((year)->System.out.println(year));
	}
}
