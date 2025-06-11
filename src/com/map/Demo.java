package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("A", 3);
		System.out.println(map.get("A")); // it will get latest

	}

}
