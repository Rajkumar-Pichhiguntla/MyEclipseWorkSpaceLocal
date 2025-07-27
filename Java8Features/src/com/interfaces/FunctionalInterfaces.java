package com.interfaces;


@FunctionalInterface
public interface FunctionalInterfaces {
	
	public void sayHi();
	
	default void sayHello() {
		System.out.println("Hello from FI..");
	}
}
