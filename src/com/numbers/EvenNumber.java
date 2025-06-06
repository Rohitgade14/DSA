package com.numbers;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
	
			if(num%2==0) {
				System.out.println(num+"even ");
			}
			else {
				System.out.println(num+"not a even");
			}
	
		
	}

}
