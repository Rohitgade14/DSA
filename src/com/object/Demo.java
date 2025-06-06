package com.object;

public class Demo {
	
	public static void main(String[] args) {
		 String name1 = "Rohit";         // stored in SCP
	        String name2 = "Rohit";         // refers to the same SCP object as name1
	        String name3 = new String("Rohit"); // stored in heap (new object)

	        // Comparisons
	        System.out.println(name1 == name2);      // true → same SCP reference
	        System.out.println(name1 == name3);      // false → name3 is a different object
	        System.out.println(name1.equals(name3)); // true → content is the same
	}

}
