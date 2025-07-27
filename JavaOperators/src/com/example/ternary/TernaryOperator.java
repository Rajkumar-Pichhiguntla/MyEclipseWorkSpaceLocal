package com.example.ternary;

import java.util.Scanner;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String stuName1 =sc.nextLine();
		System.out.println(stuName1);
		
		System.out.println("Enter Student Name :");
		String stuName2 =sc.next();
		System.out.println(stuName2);
		System.out.println("Enter Marks : ");
		int marks=sc.nextInt();
		
		
		String grade = (marks>90 && marks<=100)?"Grade A":(marks>70 && marks<=90)?"Grade B":(marks>50 && marks<=70)?"Grade C":(marks>0 && marks<=50)?"Fail":"invalid";
		
		System.out.println(stuName1+" got "+marks + " Marks :" +grade);
	}

}
