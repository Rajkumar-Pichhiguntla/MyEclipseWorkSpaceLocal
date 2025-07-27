package com;

public class Test {

	public static void main(String[] args) {
		
		Student s=new Student();
		Student s2=new Student();
		System.out.println(s.equals(s2));
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.name+s.age+s.city);
		Test t=new Test();
	}
}
