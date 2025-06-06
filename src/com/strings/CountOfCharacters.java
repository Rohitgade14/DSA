package com.strings;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {
	public static void main(String[] args) {
		
       String str="java is programing language";
       HashMap<Character, Integer> count= new HashMap<>();
       char [] c=str.toCharArray();
       
       for(char ch:c) {
    	   if(count.containsKey(ch)) {
    		   count.put(ch, count.get(ch)+1);
    	   }
    	   else {
    		   count.put(ch, 1);
    	   }
       }
       
           for(Map.Entry<Character, Integer> entry:count.entrySet()) {
        	   System.err.println(entry.getKey()+" "+entry.getValue());
           }
           
//           for(char key:count.keySet()) {
//        	   System.out.println(key+" "+count.get(key));
//           }

	}

}
