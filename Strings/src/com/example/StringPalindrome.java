package com.example;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println(isStringPalindrome("madam"));
	}
	
	public static boolean isStringPalindrome(String str) {
		
		
		return new StringBuilder(str).reverse().toString().equals(str);
		
	}

}
