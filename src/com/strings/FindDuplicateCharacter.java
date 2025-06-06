package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
	
	public static void main(String[] args) {
		String str="java";
	    HashMap<Character, Integer> hashMap= new HashMap<>();
	    char[] ch = str.toCharArray();
	    
	    for(char c:ch) {
	    	  hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
	    }
      
	     for(Map.Entry<Character, Integer> entry:hashMap.entrySet()) {
	    	if(entry.getValue()>1) {
	    		System.out.println(entry.getKey()+" "+entry.getValue());
	    	}
	     }
}
}