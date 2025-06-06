package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add("Rohit");
		linkedHashSet.add(null);
		linkedHashSet.add(10);
		linkedHashSet.add(null);

		System.out.println(linkedHashSet);
	}

}
