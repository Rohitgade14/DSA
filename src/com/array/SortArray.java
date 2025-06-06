package com.array;

public class SortArray {
	
	public static void main(String[] args) {
		int [] arr= {11,45,-77,55,17,89,33};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
