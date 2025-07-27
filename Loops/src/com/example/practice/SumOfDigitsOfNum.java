package com.example.practice;

import java.util.Scanner;

public class SumOfDigitsOfNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10; // 53%10=3
			num=num/10;  //53/10=5
		}
		System.out.println(sum);
	}
	

}
