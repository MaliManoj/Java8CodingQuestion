package com.java8;

import java.util.stream.Stream;

public class NumberSquareAverage {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,10,20,30,15).map(x->x*x).filter(s->s>100).mapToInt(a->a).average().getAsDouble());


	}

}
