package com.example.practice;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :");
		String name=sc.next(); 
		
		int stringLength=name.length();
		System.out.println("String length : "+stringLength);
		
		for(int i=1;i<=stringLength;i++) {
			int reverse=stringLength-i;
			System.out.print(name.charAt(reverse));
		}
		
	}

}
