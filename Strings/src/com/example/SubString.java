package com.example;

import java.util.Scanner;

public class SubString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SubString ss=new SubString();
		
		ss.printSubString("Rajkumar");
		
		ss.trimString("Hi   Hello");
		ss.replaceString();
	}
	
	void printSubString(String s) {
		System.out.println(s.substring(3,8));
	}
	
	void trimString(String s) {
		System.out.println("Length before "+s.length());
		String trimmed=s.trim();
		System.out.println(trimmed);
		System.out.println("length after "+trimmed.length());
		
	}
	
	void replaceString() {
//		Scanner sc=new Scanner(System.in);
//		String insert=sc.next();
//		String remove=sc.next();
		String s="Hyderabad";
		String replaced=s.replace("hyderabad","chennai");
		System.out.println(replaced);
	}
}
