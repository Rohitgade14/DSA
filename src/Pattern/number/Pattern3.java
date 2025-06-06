package Pattern.number;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
//		Enter the num
//		5
//		1
//		21
//		321
//		4321
//		54321
		
	}

}
