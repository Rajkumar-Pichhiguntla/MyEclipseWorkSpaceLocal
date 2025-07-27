package com.polymorphism.methodoverriding;

public class Test {
	
	
	public static void main(String[] args) {
		TvRemote tv=new TvRemote();
		tv.turnOn();
		tv.name="virat";
		System.out.println(tv.name);
		FanRemote fan=new FanRemote();
		fan.turnOn();
	}
	
	public static void main(int[] args) {
		System.out.println("Test main 2 method..");
	}
}
