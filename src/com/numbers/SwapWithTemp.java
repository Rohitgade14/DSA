package com.numbers;

public class SwapWithTemp {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
