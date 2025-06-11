package com.array;

import java.util.Arrays;

public class R_Rotation {
   public static void main(String[] args) {
	int [] arr= {1,2,3,4,5};
	int k = 2;
	k=k%arr.length;
	// this right side // o/p 4,5,1,2,3
	//reverse(arr, 0, arr.length-1);// rotate whole array
	//reverse(arr, 0, k-1);  // form 0 to 2 index
	//reverse(arr, k, arr.length-1); // form 2 to last index i.e 4
	
	
	// for left side
	// o/p 3 4 5 1 2
	reverse(arr, 0, k-1);  // form 0 to 2 index
	reverse(arr, k, arr.length-1);
	reverse(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
}
   
   public static void reverse(int [] arr,int start, int end) {
	   while(start<end) {
		   int temp=arr[start];
		   arr[start]=arr[end];
		   arr[end]=temp;
		   start++;
		   end--;
	   }
	
}
}
