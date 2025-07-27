package com.innerclass;

public abstract class Vehicle {
	
	public abstract void start();
	public abstract void stop();
	public void drive() {
		System.out.println("vehicle driving..");
	}
}
