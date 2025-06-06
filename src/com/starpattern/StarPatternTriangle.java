package com.starpattern;

import java.util.Scanner;

public class StarPatternTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-1;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
