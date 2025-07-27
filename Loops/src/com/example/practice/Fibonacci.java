package com.example.practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int a=0,b=1;
		for(int i=0;i<=num;i++) {
			
			System.out.println(a+" ");
			int next=a+b;
			a=b;
			b=next;
			
		}
	}
}
