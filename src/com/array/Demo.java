package com.array;

public class Demo {
	public static void main(String[] args) {
		
		
		
		String name1="rohit";
		String name2="rohit";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(name1==name2);
		String str1 = new String("rohit");
		String str2 = new String("rohit");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	
		
	}

}
