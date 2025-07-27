package com;
public class WaitNotify extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		Thread5 t5=new Thread5();
		
		
		t5.start();
		synchronized(t5) {
			t5.wait();
			System.out.println(t5.count);
		}
		
		WaitNotify.hello();
	}
	
	public static void hello() {
		System.out.println("hello");
	}

}

class Thread5 extends Thread{
	
	int count=0;
	
	@Override
	public void run() {
		for(int i=1;i<=1000000;i++) {
			count++;
		}
		
	}
}