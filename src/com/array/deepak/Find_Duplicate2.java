package com.array.deepak;

import java.util.HashSet;

public class Find_Duplicate2 {
	public static void main(String[] args) {
		// by HashSet  hs doesnot contain duplicates
		// if the number repeat 2+times then it will get printed
		int [] arr = {12,15,27,15,12,15};
		
		HashSet<Integer> hashSet = new HashSet<>();
		for(int num:arr) {
			if(hashSet.add(num)==false) {
				System.out.println(num);
			}
		}
		
	}

}
