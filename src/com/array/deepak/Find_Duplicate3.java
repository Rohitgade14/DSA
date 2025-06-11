package com.array.deepak;

import java.util.Hashtable;

public class Find_Duplicate3 {
	public static void main(String[] args) {
		int [] arr = {12,15,55,12,56,12};
		Hashtable<Integer, Integer>  hashtable = new Hashtable<>();
		
		 for(int num:arr) {
			  Integer count = hashtable.get(num);
			  if(count==null) {
				  hashtable.put(num, 1);
			  }
			  else {
				  hashtable.put(num, 1);
				  count++;
			  }
		 }
	}

}
