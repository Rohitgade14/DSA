package Pattern.number;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
