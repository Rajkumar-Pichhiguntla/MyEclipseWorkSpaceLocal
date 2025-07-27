package com;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		Thread.currentThread().setName("______MyThread1");
		String name=Thread.currentThread().getName();
		System.out.println(name);
		for(int i=1;i<=5;i++) {
			System.out.println("thread1");
		}
	}
}
