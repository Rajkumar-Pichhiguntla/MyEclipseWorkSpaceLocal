package com.example;

import java.util.Arrays;

public class CharacterCount {
	public static void main(String[] args) {
		System.out.println(charCount("rajkumar",'r'));
	}
	
	public static int charCount(String str,char ch) {
		int count=0;
		for(char s:str.toCharArray()) {
			if(s==ch) {
				count++;
			}
		}
		
		return count;
		
//		return (int) str.chars().filter(a->a==ch).count();
		
	}

}
