package com.example;

public class Reverse {
	public static void main(String[] args) {
		
		String s="Java";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println(Reverse.reverseString("Rajkumar"));;
		
		
	}
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
