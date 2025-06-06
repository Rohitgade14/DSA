package com.map;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th num");
		int num=sc.nextInt();
		
		
		 for(int i=1;i<=num;i++) {
			 if(i%5==0 && i%3==0) {
				 System.out.println("fizzBuzz");
			 }
			 else if(i%3==0) {
				 System.out.println("Buzz");
			 }
			 else if(i%5==0) {
				 System.out.println("fizz");
			 }
			 else {
				 System.out.println(i);
			 }
		 }
		
		

}
}