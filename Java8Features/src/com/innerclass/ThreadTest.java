package com.innerclass;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Runnable t1=new Thread1();
		Thread th=new Thread(t1);
		th.start();
		
		//anonymous inner class for thread class
		Runnable t2=new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Thread2 started..");
				
			}
			
		};
		Thread th2=new Thread(t2);
		th2.start();
		
		
	}

}

class Thread1 implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread1 started...");
	}
}
