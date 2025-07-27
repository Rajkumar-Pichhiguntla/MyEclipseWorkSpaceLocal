package com.thread;

public class ProduceConsume {
	public static void main(String[] args) {
		
		SharedData sd=new SharedData();
		Produce p=new Produce(sd);
		Consume c=new Consume(sd);
		
		p.start();
		c.start();
		
	}

}

class SharedData{
	private int data;
	private boolean available=false;
	
	public synchronized void produce(int value) {
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data=value;
		available=true;
		notify();
		System.out.println("Produced"+value);
	}
	public synchronized int consume() {
		while(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available=false;
		System.out.println("Consumed "+data);
		notify();
		return data;
		
		
	}
	
}

class Produce extends Thread{
	
	SharedData sd;
	
	Produce(SharedData sd){
		this.sd=sd;
	}
	
	public void run() {
		
		for(int i=1;i<=3;i++) {
			sd.produce(i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consume extends Thread{
	SharedData sd;
	
	Consume(SharedData sd){
		this.sd=sd;
	}
	
	public void run() {
		for(int i=1;i<=3;i++) {
			sd.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
