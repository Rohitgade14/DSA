package Pattern.number;

import java.util.Scanner;

public class Blue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*j);
			}
			System.out.println();
		}
	}

}
