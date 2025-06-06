package com.patterns;

import java.util.Scanner;

public class StarPattern1 {
	// rows=i, rows are fixed
	//col=j

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter col");
		int col=sc.nextInt();

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}


//		Enter the row
//		5
//		Enter col
//		5
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *


	}

}
