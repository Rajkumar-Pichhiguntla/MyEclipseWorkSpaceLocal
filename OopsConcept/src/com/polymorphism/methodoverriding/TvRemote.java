package com.polymorphism.methodoverriding;

public class TvRemote extends Remote{
	
	
	@Override
	void turnOn() {
		System.out.println("Tv Turned On...");
	}
	

}
