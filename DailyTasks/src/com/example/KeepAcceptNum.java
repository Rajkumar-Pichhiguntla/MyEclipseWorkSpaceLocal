package com.example;

import java.util.Scanner;

public class KeepAcceptNum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num=sc.nextInt();
		int sum=num;
		while(num!=0) {
			num=sc.nextInt();
			sum+=num;
		}
		
		System.out.println(sum);
	}
}
