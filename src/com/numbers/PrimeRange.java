package com.numbers;

import java.util.Scanner;

public class PrimeRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 num");
		int num1=sc.nextInt();
		System.out.println("Enter 2 num");
		int num2=sc.nextInt();
		 
		
		for(int i=num1;i<=num2;i++) {
			int j;
			for(j=2;j<=i;j++) {
				if(i%j==0) {
					 break;
				}
			}
			
			if(i==j) {
				System.out.println(i);
			}
		}
		
	}

}
