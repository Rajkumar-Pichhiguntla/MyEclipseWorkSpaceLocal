package com.polymorphism.accessmodifiers;

import com.test.Test2;

public class Test {
	
	protected static int a=10;
	
public static void main(String[] args) {
	
	Parent p=new Parent();
	Test t=new Test();
	Test2 t2=new Test2();
	p.talk();
	System.out.println(t.a);
	System.out.println(p.b);
	
	
}
public Test() {
	
}
}
