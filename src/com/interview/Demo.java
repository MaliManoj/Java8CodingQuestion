package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Demo {

	public static void main(String[] args) {
		/*
		 * List<Integer>list=Arrays.asList(1,2,3,4,2,3,7,8); Set<Integer>set=new
		 * HashSet<>();
		 * list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
		 */
		Employee e1 = new Employee(-1, "Manoj");
		Employee e2 = new Employee(-2, "Kishore");
		Employee e3 = new Employee(-3, "Lalit");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Optional<Integer> findFirst2 = list.stream().map(x -> x.getId()).sorted(Comparator.naturalOrder()).skip(0)
				.findFirst();
		System.out.println(findFirst2.get());     

		Stream.of("manoj","kishore",1)
				.forEach(x -> System.out.println(x));
		Optional<Integer> findFirst = list.stream().map(x -> x.getId()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println(findFirst.get());
	}

}
