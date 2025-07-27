package com.polymorphism.overloading;

public class Calculator {
	
	public static void main(String[] args) {
		
		int sum=Calculator.sum(100,20);
		System.out.println(sum);
		sum=Calculator.sum(10,20);
		System.out.println(sum);
		Calculator.sum(20,"Raj");
		sum=Calculator.sum(10,20,30);
		System.out.println(sum);
	}
	
	static int sum() {
		int a=10+20;
		return a;
	}
	
	static int sum(int input1,int input2) {
		int sum=input1+input2;
		return sum;
	}
	static void sum(int input,String name) {
		String a=input+name;
		System.out.println(a);
	}
	
	static int sum(int input1,int input2,int input3) {
		int sum=input1+input2+input3;
		return sum;
	}

}
