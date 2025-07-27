package com.example;

import java.util.Scanner;

public class ByteTypeArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		
		byte size=sc.nextByte();
		
		byte[] arr=new byte[size];
		
		System.out.println("Length of Array : "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element "+ (i+1)+" to add in arr :");
			arr[i]=sc.nextByte();
			
		}
		
		System.out.println("Printing Array : ");
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
		
	}

}
