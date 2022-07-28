package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Employee
{
	int salary;
	String name;
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class SecondMaxSalary {

	public static void main(String[] args) {
		Stream<Employee> stream = Stream.of(new Employee(200, "Manoj"),new Employee(300, "Pankaj"),new Employee(400, "Nivesh"));
		Optional<Integer> findFirst = stream.map(x->x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("SMax salary "+findFirst.get());

		List<Integer>list=Arrays.asList(100,200,400,300);
		System.out.println("Max salary "+list.stream().max((a,b)->a.compareTo(b)).get());
		
	}

}
