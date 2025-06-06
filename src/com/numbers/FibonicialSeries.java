package com.numbers;

import java.util.Scanner;

public class FibonicialSeries {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the num");
		  int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		for(int i=0;i<=num;i++) {
			System.out.println(num3);
		        	num3=num1+num2;
		    	// 0+1=1,1+1=2,
			num1=num2;
			num2=num3;
		}

	}

}
