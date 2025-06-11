package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
				Arrays.asList("mango","apple"),
				Arrays.asList("bannana","orange")
				);
		
		    List<String> result = list.stream()
				.flatMap(List::stream)
	          .map(String::toUpperCase)
	         .collect(Collectors.toList());
		        System.out.println(result);
		
		
		list.stream()
		.flatMap(str ->str.stream())
		.map(str ->str.toUpperCase())
		.forEach(System.err::println);
	}

}
