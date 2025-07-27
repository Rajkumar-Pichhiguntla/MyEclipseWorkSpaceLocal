package com;

public class Test {
	public static void main(String[] args) {
		

		
		MyThread2 thread2=new MyThread2();
		MyThread3 thread3=new MyThread3();
		
		Thread t3=new Thread(thread3);
		
		thread2.start();
	
		t3.start();
		MyThread1 thread1=new MyThread1();
		thread1.start();
		
		System.out.println("Main Method");
		
		
		
	}

}
