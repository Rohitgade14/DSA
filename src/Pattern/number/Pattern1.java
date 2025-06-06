package Pattern.number;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
        // j continous changes 
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				
				
			}
			System.out.println();
		}
	}

}

//for i
//Enter row
//5

//1
//22
//333
//4444
//55555

//_____
//for j
//Enter row
//5

//1
//12
//123
//1234
//12345