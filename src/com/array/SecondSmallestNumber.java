package com.array;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int[] arr= {5,1,4,8,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		System.out.println(arr[1]);
	}

}
