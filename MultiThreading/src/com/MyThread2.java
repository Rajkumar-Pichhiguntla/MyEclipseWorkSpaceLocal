package com;

public class MyThread2 extends Thread {

	
	@Override
	public void run() {
		MyThread1 t1=new MyThread1();
		
		Thread.currentThread().setName("______MyThread2");
		
		String name=Thread.currentThread().getName();
		System.out.println(name);
		for(int i=1;i<=20;i++) {
			
			System.out.println("thread2");
		}
	}
}
