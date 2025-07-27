package com.multipleinheritance;

public class Child  implements A,B{

	@Override
	public void m1() {
		System.out.println("Hi Im M1");
		
	}

	@Override
	public void m3() {
		System.out.println("Hi Im M3");
		
	}

	@Override
	public void m2() {
		System.out.println("Hi Im M2");
		
	}
	

}
