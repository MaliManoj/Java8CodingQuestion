package com.java8;

import java.util.stream.Stream;

public class NumberStartWith {

	public static void main(String[] args) {
		Stream.of(1,10,20,30,15).map(String::valueOf).filter(x->x.startsWith("2")).map(Integer::valueOf).forEach(x->System.out.println(x));
	}

}
