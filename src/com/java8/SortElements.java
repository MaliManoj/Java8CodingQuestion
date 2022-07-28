package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElements {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(100,200,400,300,300);
	list.stream().sorted(Comparator.naturalOrder()).distinct().forEach(a->System.out.println(a));
	
	System.out.println("First 2 elements ");
	list.stream().sorted(Comparator.naturalOrder()).limit(2).forEach(a->System.out.println(a));
	
}	
}
