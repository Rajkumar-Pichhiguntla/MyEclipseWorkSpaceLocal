package com.example;

public class PrintingCharacters {
	public static void main(String[] args) {
		String company = "FrontlinesMediaEdutech";
		int stringLength=company.length();
		System.out.println(stringLength);
		
		System.out.println("Getting every characters from String : ");
		for(int i=0;i<stringLength;i++) {
			char ch=company.charAt(i);
			System.out.println(ch);
		}
	}
}
