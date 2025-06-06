package com.numbers;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
        int num=153;
        int temp=num;
        int sum=0;
        while(num!=0) {
        	int rem=num%10;
        	num=num/10;
        	sum=sum+(rem*rem*rem);

        }

        if(sum==temp) {
        	System.out.println("given num is armStrong num");
        }
        else {
        	System.out.println("not a palldrome");
        }

	}

}
