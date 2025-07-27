package com.interfaces;

public class Impl implements Interface2,FunctionalInterfaces{

	@Override
	public void sayHi() {
		System.out.println("hii");
		
	}

	@Override
	public void sayHello() {
		FunctionalInterfaces.super.sayHello();
		Interface2.super.sayHello();
		
	}
	

}
