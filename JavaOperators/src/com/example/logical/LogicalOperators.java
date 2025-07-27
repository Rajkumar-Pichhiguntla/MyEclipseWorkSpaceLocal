package com.example.logical;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean b1=true;
		boolean b2 = false;
		boolean b3=true;
		boolean b4=false;
		
		
		System.out.println(b1&&b2);
		
		System.out.println(b1&&b3);
		
		System.out.println(b2&&b4);
		
		System.out.println(b1&&b2&&b3);
		
		System.out.println(b1&&b2&&b3&&b4);
		
		System.out.println(b4||b2);
		
		System.out.println(b1||b2||b4||b3);
		
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		boolean result1=(num1>num2)|| (num2==num3);
		System.out.println(result1);
	}
	
	
}
