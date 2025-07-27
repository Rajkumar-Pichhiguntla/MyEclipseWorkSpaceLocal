package com.example.practice;

import java.util.Scanner;

public class MulplicationTable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number for multiplication table:");
		int num=sc.nextInt();
		System.out.println("Enter a number upto where to multiply "+num);
		int num2=sc.nextInt();
		
		for(int i=1;i<=num2;i++) {
			int mul=num*i;
			System.out.println(num+" x "+ i+" = "+mul);
		}
	}
}
