package com.example;

import java.util.Scanner;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter sentance:");
		
		String sentance=sc.nextLine();
		
		 String reversed=reverseWords(sentance);
		System.out.println(reversed);
		
	}
	static String reverseWords(String sentance) {
		
		String[] words=sentance.split(" ");
		String reversed="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			reversed=reversed+words[i];
			if(i!=0) {
				reversed+=" ";
			}
		}
		
		return reversed;
		
		
	}

}
