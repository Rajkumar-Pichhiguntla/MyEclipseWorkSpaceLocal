package com.example;

import java.util.Scanner;

public class IntTypeArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		
		short size=sc.nextShort();
		
		short[] passcodes=new short[size];
		
		for(int i=0;i<passcodes.length;i++) {
			System.out.println("Enter pincodes you know :");
			passcodes[i]=sc.nextShort();
		}
		
		System.out.println("Pincodes :");
		for(int j=0;j<passcodes.length;j++) {
			System.out.println(passcodes[j]);
		}
	}
}
