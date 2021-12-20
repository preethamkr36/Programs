package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaTrigger {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Jayanagar","Basavanagudi","JP Nagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Begur Kopa Road","Hebbal","Doddaballapur Road","Electronic City","Hegade Nagar","Hesaraghatta","Hoskote","Hosur","Indiranagar","Koramangala","Krishnarajapuram","MG Road","Marathahalli","Rajajinagar");
		List<String> list=stream.map(String::toLowerCase).sorted().collect(Collectors.toList());
		list.forEach((area)->System.out.println(area));
		System.out.println();
		Stream<String> stream1=Stream.of("Jayanagar","Basavanagudi","JP Nagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Begur Kopa Road","Hebbal","Doddaballapur Road","Electronic City","Hegade Nagar","Hesaraghatta","Hoskote","Hosur","Indiranagar","Koramangala","Krishnarajapuram","MG Road","Marathahalli","Rajajinagar");
		List<String> list1=stream1.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list1.forEach((area)->System.out.println(area));
	}
}
