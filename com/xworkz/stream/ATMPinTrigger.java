package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ATMPinTrigger {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1234,2345,3456,4567,5678,6789,4321,5432,6543,7654,8765,9876,7665,4434,1222,1655,1987);
		List<Integer> list=stream.filter((pin)->pin>3000).collect(Collectors.toList());
		list.forEach((pin)->System.out.println(pin));
	}
}
