package com.xworkz.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRTrigger {
	public static void main(String[] args) {
		Stream<Long> stream=Stream.of(4360393388L,4483848586L,8374655373L,3366446655L,7743972895L,9261649436L,8854325543L,8865456788L,4454432234L,9987087677L,6675432123L,6556787654L,8765445632L,9876678955L,8876543345L,8374655342L,3476234587L);
		List<Long> list=stream.filter((pnr)->pnr>5000000000L).sorted().collect(Collectors.toList());
		list.forEach((l)->System.out.println(l));
	}
}
