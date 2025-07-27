package com.example;

public class Buffers {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Java");
		sb.append("world");
		sb.insert(4, ",");
		sb.replace(5, 15, "Program");
//		sb.delete(4, 5);
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("123456789");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String s=sb.toString();
		System.out.println(s);
		
		StringBuilder sb1=new StringBuilder("GebeksforGeeks");
		System.out.println(sb1.charAt(20));
//		sb1.ensureCapacity(50);
//		System.out.println((char)sb1.charAt(2)-1);
//		System.out.println(sb1.capacity());
		System.out.println(sb1.indexOf("for"));
		System.out.println(sb1.deleteCharAt(7));
//		System.out.println(sb1);
	
		
		
		
	}
}
