package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Collection al = new ArrayList<>();
		Collection ll= new ArrayList<>();
		Collection veector = new ArrayList<>();
		Collection  stack = new Stack();
		
		
		Collection cl = new ArrayList<>();
		cl.add(10);
		cl.add(20);
		
		
		Collection cl1 = new ArrayList();
		cl1.addAll(cl);
		
		System.out.println(cl1);
		
		
	}

}
