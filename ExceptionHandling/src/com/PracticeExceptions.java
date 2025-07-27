package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeExceptions {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int c;
		try {
			c=num1/num2;
			System.out.println(c);
		}
		
		
		catch(InputMismatchException | IndexOutOfBoundsException  e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Divided by zero not possible");
			try {
				int age=sc.nextInt();
				
				System.out.println(age);
				
			}
			catch(Exception ex) {
				System.out.println("enter correct typed data");
			}
			System.exit(0);//forcefull shutdown of jvm 
		}
		
		finally {
			System.out.println("Finally executed");
			sc.close();
		}
		
	}

}
