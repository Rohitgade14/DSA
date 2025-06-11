package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add("rohit");
		al.add('r');
		al.add(20);
		
		//System.out.println(al.get(0));
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
