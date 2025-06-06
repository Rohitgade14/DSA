package com.array.sorting;

public class RemoveDuplicateSorted1 {
	public static void main(String[] args) {
		int [] arr = {21,35,35,47,47,56,68,68,68};
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]= arr[arr.length-1];
	
		for(int i=0;i<=j;i++) {
			System.out.println(arr[i]);
		}
	}

}
