package com.practice;

import java.util.Scanner;

public class DivideNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try {
			int num3=num1/num2;
			System.out.println(num3);
		}
		catch(ArithmeticException e) {
			System.out.println("Number can't be divide with Zero");
		}
	}

}
