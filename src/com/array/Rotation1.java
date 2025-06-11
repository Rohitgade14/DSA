package com.array;

import java.util.Arrays;

public class Rotation1 {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};
	   int k=2;
	   k=k % arr.length;
	   Rotation1 rotation1 = new Rotation1();
	   rotation1.rotate(arr, k);
	   
}	
	
	public void rotate(int [] arr,int k) {
		   reverse(arr, 0, arr.length-1);
		   reverse(arr, 0, k-1);
		 int[] result = reverse(arr, k, arr.length-1);
		 System.out.println(Arrays.toString(result));
		  
		   
	}
	public static int [] reverse(int [] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}