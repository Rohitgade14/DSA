package com.multi;

public class Demo  implements Runnable {

	 public static void main(String[] args) {
		Demo  demo = new Demo();
		
		Thread thread = new Thread(demo);
		thread.start();
		
		
	}
	public void run() {
		System.out.println("run method......");
		
	}
	
	

}
