package com.example.practice;

import java.util.Scanner;

public class PrintOddNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check upto :");
		int upto=sc.nextInt();
		
		for(int i=1;i<=upto;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
