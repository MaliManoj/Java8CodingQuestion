package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

	public static void main(String[] args) {
		List<String>list=Stream.of("Manoj Mali".split("")).toList();
		System.out.println(list);
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		map.forEach((k,v)->System.out.println("Element "+k+" Count "+v));
		
	
		
	}

}
