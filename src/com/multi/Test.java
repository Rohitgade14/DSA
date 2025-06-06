package com.multi;

public class Test  extends Thread{
	public static void main(String[] args) {
		
		Test test = new Test();
		test.start();
		
	}
	
	
	
	public void run() {
		System.out.println("run method get call");
	}

}
