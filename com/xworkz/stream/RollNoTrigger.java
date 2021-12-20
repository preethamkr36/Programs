package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoTrigger {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(110,109,108,107,106,101,102,103,104,105,201,202,210,205,204,206,207,208,209,203);
		List<Integer> list=stream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list.forEach((roll)->System.out.println(roll));
	}
}
