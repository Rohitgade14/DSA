package com.array;

public class FindLargestNumber {
           public static void main(String[] args) {
			int [] arr = {12,34,55,78,9,67,19};
			int max= arr[0]; // we set 0 max number
			int min =arr[0];
			for(int i=1;i<arr.length;i++) {
				if(max<arr[i]) { // arr[i]>max  
					max=arr[i];  //
					                                        
				}
				else if(min>arr[i]) {
					min=arr[i];
				}
				
				
			}
			  System.out.println(max);
			  System.out.println(min);
			
		}
}
