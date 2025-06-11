package com.strings;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacter {
	
	public static void main(String[] args) {
		String str ="java is programing language";
		HashMap<Character, Integer> count = new HashMap<>();
		
		char[] ch = str.toCharArray();
		for(char c:ch) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}
			else {
				count.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry :count.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
