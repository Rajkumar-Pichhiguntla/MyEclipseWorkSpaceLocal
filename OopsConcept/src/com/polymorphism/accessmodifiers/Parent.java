package com.polymorphism.accessmodifiers;
import com.polymorphism.accessmodifiers.Test;
public class Parent {
	int b=20;
	protected String name="rajkumar";
	Test t=new Test();
	void talk() {
		System.out.println("talking..");
		System.out.println(t.a);
	}
}
