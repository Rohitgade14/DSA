package Pattern.number;

public class Pattern7 {
	public static void main(String[] args) {
		int num=5;
	
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(i%2!=0) {
			for(int j=1;j<=3;j++) {
				count++;
				System.out.print(count);
			}
				}
			
			else {
				for(int j=1;j<=3;j++) {
					count++;
					System.out.print(count);
				}
			}
			System.out.println();
			
		}
	}

}
//123
//456
//789
//101112
//131415
