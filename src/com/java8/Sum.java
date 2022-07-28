package com.java8;

import java.util.stream.Stream;

public class Sum {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,2,3,4,5).reduce((a,b)->(a+b)).get());
	}

}
