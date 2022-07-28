package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,4,5,6,7,3,5,2);
		list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toSet()).stream().forEach(x->System.out.println(x));;
		Set<Integer>set=new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
	}

}
