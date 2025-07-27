package com.example;

import java.util.Scanner;

public class SumOfMulOfThreeAndFive {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
