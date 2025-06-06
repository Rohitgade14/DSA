package com.numbers;

import java.util.Scanner;

public class PalldromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the num");
//		int num=sc.nextInt();
		int num=121;
		int temp=num;
		int rev=0;

	      while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("given num is palldrome");
		}
		else {
			System.out.println("not a palldrome");
		}


	}


}
