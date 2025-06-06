package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,1,2,3,4,5,6);
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
	}

}
