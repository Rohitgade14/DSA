package com.collection.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(null);
		hashSet.add("rohit");
		hashSet.add('r');
		hashSet.add(null);
		hashSet.add(10);
		
		System.out.println(hashSet);
		
	}

}
