package com.deepstech.pratice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicates {
	public static void main(String[] args) {

		String str = "Good bye bye Good bye Good";
		str = Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));
		System.out.print(str);
	}
}
