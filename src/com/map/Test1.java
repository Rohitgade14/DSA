package com.map;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
			 fizzbuzz(num);
			
	}
	
	public static String fizzbuzz(int num) {
		
		
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0) {
				return "fuzzBuzz";
			}
			else if(i%3==0) {
				return "buzz";
			}
			else if(i%5==0) {
				return "buzz";
			}
			
			
			
		}
		
		return String.valueOf(num);
		
	}

}
