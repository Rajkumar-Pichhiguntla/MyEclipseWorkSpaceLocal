package com.polymorphism.methodoverriding;

public class AcRemote extends Remote {
	
	@Override
	void turnOn() {
		System.out.println("Ac Turned On..");
	}
}
