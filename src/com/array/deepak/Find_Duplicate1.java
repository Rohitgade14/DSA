package com.array.deepak;

public class Find_Duplicate1 {
   // brute force method 
   public static void main(String[] args) {
		int [] arr = {12,15,55,12,56,56};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println(arr[j]);
				}
			}
		}
		
}
}
