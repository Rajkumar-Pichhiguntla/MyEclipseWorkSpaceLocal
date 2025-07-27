package com.example;

import java.util.Scanner;

public class LargestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int greater=0;
		while(num>0) {
		   int digit=num%10;
		   
			if(digit>greater) {
				 greater=digit;
			}
		num=num/10;
		}
		System.out.println(greater);
		
	}
}
