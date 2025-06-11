package com.array;

import java.util.HashSet;

public class RepeatingElements1 {

	  public static void main(String[] args) {
		  int[] arr = {4, 5, 6, 7, 5, 4, 8};
		  
		  HashSet<Integer> hashSet = new HashSet<>();
		  
		  for(int num:arr) {
			  if(!hashSet.add(num))
			  {
				  System.out.println(num);
			  }
		  }
	}
}
