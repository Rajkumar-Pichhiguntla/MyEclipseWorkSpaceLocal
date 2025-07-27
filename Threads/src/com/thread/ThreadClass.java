package com.thread;

import java.net.MulticastSocket;

public class ThreadClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread1 t1=new Thread1();
		Thread1 t3=new Thread1();
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.setDaemon(true);
		t3.start();
		t1.start();
		t1.sleep(2000);
		System.out.println(t1.getState());
		Thread.yield();
		System.out.println(t1.getState());
		t1.join(10);
		Thread2 t2=new Thread2();
		
		Thread t=new Thread(t2);
		t.start();
		
		Thread.sleep(500);
		System.out.println("main");
	}

}
class Thread1 extends Thread{

	public void run() {
		System.out.println("Thread 1 running....");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		System.out.println("Thread1 Finished..");
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("thread2 running...");
		
	}
	
}
