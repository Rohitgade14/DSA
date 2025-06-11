package com.array;

public class FindLargestNumber {
           public static void main(String[] args) {
	         int [] arr = {34,17,29,65,78,13};
	         int max = arr[0];
	         int min= arr[0];
	         
	         for(int i=1;i<arr.length;i++) {
	        	 if(max<arr[i]) {
	        		 max=arr[i];
	        	 }
	        	 else if(min>arr[i]) {
	        		 min=arr[i];
	        	 }
	         }
	         
	         System.out.println(max);
	         System.out.println(min);
		}
}
