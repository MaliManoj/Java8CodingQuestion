package com.java8;

import java.util.stream.Stream;

public class MexLenghtString {

	public static void main(String[] args) {
		System.out.println(Stream.of("Manoj", "Mali", "Kishore", "ManojMali")
				.reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get());

	}

}
