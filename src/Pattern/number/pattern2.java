package Pattern.number;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		int c=0;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				c++;
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
