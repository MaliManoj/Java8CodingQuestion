package com.java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurance {
public static void main(String[] args) {
	List<String>list=Stream.of("Manoj Mali".split("")).toList();
	System.out.println(list);
	Map<String, Long> map = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	map.forEach((k,v)->System.out.println("Element "+k+" Count "+v));
	
	// To maintain the order of charater we use linkedHashMap
	LinkedHashMap<String, Long> collect = list.stream().collect(Collectors.groupingBy(x->x,LinkedHashMap::new, Collectors.counting()));
	map.forEach((k,v)->System.out.println("Element "+k+" Count "+v));
	
	// To print in order of frequncy
	Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	map2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e->System.out.println(e.getKey()+""+e.getValue()));
}
}
