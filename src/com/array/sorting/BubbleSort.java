package com.array.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {23,12,36,77,17};
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		
		}
		
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
