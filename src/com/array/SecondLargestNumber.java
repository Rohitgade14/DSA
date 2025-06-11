package com.array;

public class SecondLargestNumber {

	 public static void main(String[] args) {
		int [] arr= {12,17,99,63,55,14};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[1]);
	}
}
