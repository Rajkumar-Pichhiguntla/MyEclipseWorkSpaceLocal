package com.practice;

import java.util.Scanner;

public class multipleCatchBlocks {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter index value: ");
		int index=sc.nextInt();
		System.out.println("Enter divisor : ");
		int divisor=sc.nextInt();
		
		try {
			int result=arr[index]/divisor;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Not divisible by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range!");
		}
		finally {
			System.out.println("Execution Finished");
		}
		
		
		
	}

}
