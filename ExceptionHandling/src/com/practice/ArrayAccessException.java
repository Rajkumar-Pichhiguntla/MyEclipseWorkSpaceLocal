package com.practice;

public class ArrayAccessException {
	public static void main(String[] args) {
		
		int [] arr=new int[5];
		
		try {
			int a=arr[6];
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range!");
		}
		
		String str="abc";
		
		try {
			Integer a=Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
