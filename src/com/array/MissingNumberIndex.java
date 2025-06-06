package com.array;

public class MissingNumberIndex {
   
	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		int n=arr.length+1;
		int totalSum=n*(n+1)/2;
		int actualSum=0;
		
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		int missingNumber=totalSum-actualSum;
		System.out.println(missingNumber);
		
		
		int index=0;
		while( index <arr.length && arr[index]<missingNumber) {
			index++;
		}
		
		System.out.println(index);
	}
}   
