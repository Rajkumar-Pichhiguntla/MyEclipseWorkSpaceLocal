package com.interfaces;


//@FunctionalInterface
public interface Interface2 {
	
	public void sayHi();
	default void sayHello() {
		System.out.println("Hello from Interface2..");
	}
	default public void defalutMethod() {
		System.out.println("from default method interface2");
	}

	
	static void staticMethod() {
		System.out.println("Static method ");
	}
}
