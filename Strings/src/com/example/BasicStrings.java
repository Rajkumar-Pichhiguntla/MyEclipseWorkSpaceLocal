package com.example;

public class BasicStrings {
	
	public static void main(String[] args) {
		
		
		String s1="Rajkumar"; //using Literals
		
		String s2=new String("Raj kumar");//using object
		
		String s3="raj";
		String s4=new String("Rajkumar");
		
		String s5=new String("raj");
		System.out.println(s1);
		System.out.println(s2);
		
		BasicStrings bs=new BasicStrings();
		String result=bs.getName(s5);
		System.out.println(result);
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.equals(s4));
		
		System.out.println(s3==result);
		System.out.println(s3.equals(result));
		
	}
	
	String getName(String s) {
		
		return s;
	}
	
	

}
