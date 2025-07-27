package com.multipleinheritance;

public class Main {
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		Child2 c2=new Child2();
		c2.hello();
		c2.m1();
	}

}
