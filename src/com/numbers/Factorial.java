package com.numbers;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int fact=1;

		for(int i=1;i<=num;i++) {
			fact=fact*i;
			// 1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
		}
		System.out.println(fact);
	}

}
