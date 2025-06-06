package com.patterns;

import java.util.Scanner;

public class StarPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		System.out.println("Enter col");
		int col=sc.nextInt();

		for(int i=1;i<=row;i++) {
			for(int j=row-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		Enter row
//		5
//		Enter col
//		5
//		    *
//		   **
//		  ***
//		 ****
//		*****

	}

}
