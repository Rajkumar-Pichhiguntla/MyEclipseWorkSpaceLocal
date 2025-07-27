package com;

import java.util.Scanner;

public class CustomExceptions {
	
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter age :");
			int age=sc.nextInt();
			
			if(age>=18) {
				System.out.println("Can vote");
			}
			else {
				throw new InvalidAgeException("You are Not eligible!!");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println("Not Eligible");
		}
		finally {
			sc.close();
		}
	}

}
