package com.polymorphism.methodoverriding;

public class FanRemote extends Remote{
	
	@Override
	void turnOn() {
		System.out.println("Fan Turned On....");
	}
}
