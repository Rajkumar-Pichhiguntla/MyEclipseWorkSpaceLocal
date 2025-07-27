package com.polymorphism.accessmodifiers;
import com.polymorphism.accessmodifiers.Parent;

public class Child {
	
	Parent p=new Parent();
	
	void print(){
		System.out.println(p.name);
	}

}
