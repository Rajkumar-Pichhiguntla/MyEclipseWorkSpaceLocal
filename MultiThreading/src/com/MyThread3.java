package com;

public class MyThread3 implements Runnable{

	@Override
	public void run() {
		MyThread1 t1=new MyThread1();
		
		Thread.currentThread().setName("______MyThread3");
		String name=Thread.currentThread().getName();
		System.out.println(name);
		for(int i=0;i<=3;i++) {
			
			System.out.println("MyThread3");
		}
		
	}

}
