package com;
public class Parent{
	
	public static void main(String[] args) {
		Child c=new Child();
		c.isEligible();
		
		
	}

}
class Child{
	
	int age=20;
	static int id=121;
	public Child() {
		System.out.println("non parameterized");
	};
	public Child(int age) {
		this();
		System.out.println(age);
	}
	
	public void isEligible() {
		Child c=new Child(21);
	}
}
