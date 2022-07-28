package com.java8;

import java.util.List;
import java.util.stream.Stream;

class Teacher
{
	String grade;
	double salary;
	String name;
	public Teacher(String grade, double salary, String name) {
		super();
		this.grade = grade;
		this.salary = salary;
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class AvgSalaryOfGradeAEmployee {

	public static void main(String[] args) {
		List<Teacher>list=Stream.of(new Teacher("A", 1200, "Manoj")
				,new Teacher("B", 1300, "Kisore"),new Teacher("A", 1350, "Aman")).toList();
		System.out.println(list.stream().filter(e->e.getGrade().equalsIgnoreCase("A"))
		.map(e->e.getSalary())
		.mapToDouble(x->x).average().getAsDouble());
	}

}
