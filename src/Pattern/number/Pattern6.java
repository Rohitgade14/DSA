package Pattern.number;

public class Pattern6 {
	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=num;i++) {
			int no=i;
			for(int j=1;j<=i;j++) {
				System.out.print(no); 
				no=no+5-j;
			}
			System.out.println();
		}
		
	}

}
