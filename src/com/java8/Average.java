package com.java8;

import java.util.stream.Stream;

public class Average {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,25,6,8,9,4).mapToInt(x->x).average().getAsDouble());

	}

}
