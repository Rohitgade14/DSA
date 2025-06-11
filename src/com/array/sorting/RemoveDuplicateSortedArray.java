package com.array.sorting;

public class RemoveDuplicateSortedArray {
	public static void main(String[] args) {
		int [] arr = {21,35,35,47,47,56,68,68,68};
		int [] temp= new int[arr.length];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
			     temp[j]=arr[i];
			     j++;
			}
		}
		
	     temp[j]=arr[arr.length-1];
//	     for(int num:temp) {
//	    	 System.out.println(num);
//	     }
	     
	     for(int i=0;i<=j;i++) {
	    	 System.err.println(arr[i]);
	     }
	     
	     
	}

}
