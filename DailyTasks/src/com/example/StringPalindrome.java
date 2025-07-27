package com.example;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter word: ");
		String word=sc.nextLine();
		boolean palindrome=stringPalindrome(word);
		System.out.println(palindrome);
		
	}
	
	static boolean stringPalindrome(String s) {
		
		boolean isPalindrome=false;
		String reverse="";
		String temp=s;
		int length=s.length();
		
		for(int i=length-1;i>=0;i--) {
			
			reverse+=s.charAt(i);
		}
		
		if(reverse.equals(temp)) {
			isPalindrome=true;
		}
		
		
		
		return isPalindrome;
	}

}
