package com.patterns;

import java.util.Scanner;

public class StarPattern1Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		System.out.println("Enter the cols");
		int col=sc.nextInt();

		for(int i=1;i<=row;i++) {
			for(int j=col;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Enter the rows
//		5
//		Enter the cols
//		5
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
	}

}
