package com.array;

import java.util.HashSet;

public class RemoveDuplicate3 {
	public static void main(String[] args) {
	   int [] arr = {1,3,2,5,2,4,3};
	   HashSet<Integer> hashSet = new HashSet<>();
	   
	   for(int i=0;i<arr.length;i++) {
		   hashSet.add(arr[i]);
	   }
	   
		for(int num:hashSet) {
			System.out.println(num);
		}
	}

}
