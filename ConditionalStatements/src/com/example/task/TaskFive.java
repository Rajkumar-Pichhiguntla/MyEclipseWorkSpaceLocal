package com.example.task;

import java.util.Scanner;

public class TaskFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
//******************Task-5.1 -- Menu Application****************
/*		
		System.out.println("Welcome to Raj's Restaurents");
		System.out.println("Menu Options : ");
		System.out.println("1.Chicken 65");
		System.out.println("2.Butter Panner");
		System.out.println("3.Chicken Biryani");
		System.out.println("4.Fried Rice");
		
		System.out.print("Enter an option to Order Food : ");
		
		int option= sc.nextInt();
		
		
		
		//Using Switch Case 
	
		switch(option) {
		case 1:
			System.out.println("Your Chicken 65 order placed successfully");
			break;
		case 2:
			System.out.println("Your Butter panner order placed successfully");
			break;
		case 3:
			System.out.println("Your Chicken Biryani Order placed Successfully");
			break;
		case 4:
			System.out.println("Your Fried Rice order Placed Successfully");
			break;
		default :
			System.out.println("You ordered Nothing");
			break;
		}

		
		//Using If-Else Statements
		
		if(option==1) {
			System.out.println("Your Chicken 65 order placed successfully");
		}
		else if(option==2) {
			System.out.println("Your Butter Panner order placed successfully");
		}
		else if(option==3) {
			System.out.println("Your Chicken Biryani order placed successfully");
		}
		else if(option==4) {
			System.out.println("Your Fried Rice order placed successfully");
		}
		else {
			System.out.println("Ordered Nothing");
		}

		
//******************Task-5.2 -- Basic Calculator Application*****************
	
		System.out.println("Enter Two Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
//		sc.nextLine();
		System.out.println("Choose Operation to perform : +,-,*,/,%");
		//char operation=sc.next().charAt(0);
		String operation=sc.nextLine();
		
		switch(operation) {
			case "+" :
				int result1=a+b;
				System.out.println(a+ " + " + b + " = " + result1);
				break;
			case "-" :
				int result2=a-b;
				System.out.println(a+ " - " + b + " = " + result2);
				break;
			case "*":
				int result3=a*b;
				System.out.println(a+ " * " + b + " = " + result3);
			default :
				System.out.println("enter correct operation");
		}

		
//*****************Task-5.3 -- Leap Year*************

		System.out.println("Enter year to Check Leap year or Not : ");
		int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0) ) {
				System.out.println(year + " is Leap year");
			}
		else {
				System.out.println(year + " Not Leap Year");
			}
	

//****************Task-5.4  -- Command LIne Arguments************
	
		String input=args[0];
		String input2=args[1];
		System.out.println(input+" Edutech "+input2);

		
//****************Task-5.5 -- Largest Number***********
	
		System.out.println("Enter numbers to compare : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println(num1+" is largest Number");
		}
		else if((num2>num1) && (num2>num3)) {
			System.out.println(num2+ " is largest Number");
		}
		else {
			System.out.println(num3+" is largest number");
		}

		
// ****************Task-5.6 -- Even and Divisible by 5*************
		
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		
		if((num%2==0)) {
			if(num%5==0) {
				System.out.println("NUmber is Even and Divisible by 5");
			}
			else {
				System.out.println(num+" is Even and but Not Divisible by 5");
			}
			
		}
		else {
			System.out.println("Number is Odd");
		}

		
//       *****Task 5.7 - Calculate Bill with Discount*****
	
		System.out.println("Number of Products Bought : ");
		int numberOfProducts=sc.nextInt();
		System.out.println("Are you a Premium Member :");
		boolean isPremium =sc.nextBoolean();
		
		int costOfProduct = 1000;
		
		int discountPerProduct = 100;
		
		if(isPremium) {
			
			int bill = numberOfProducts * costOfProduct;
			int discount = numberOfProducts * discountPerProduct;
			int totalBill = bill - discount;
			
			System.out.println("Total Bill : "+ totalBill);
			
			System.out.println("Explanation : Each Product = "+costOfProduct);
			System.out.println(numberOfProducts+" Products = "+ bill);
			System.out.println("Discount for "+numberOfProducts+" Products = "+discount);
			System.out.println("Final Bill = "+ bill+"-"+discount + " = " +totalBill );
			
		}
		else {
			int bill = numberOfProducts * costOfProduct;
			System.out.println("Total Bill : "+bill);
			
			System.out.println("Explanation : Each Product = "+costOfProduct);
			System.out.println(numberOfProducts+" Products = "+ bill);
			System.out.println("Discount for "+numberOfProducts+" Products = 0 (Not Premium Member)" );
			System.out.println("Final Bill = "+ bill + " = " +bill );
		}
		
*/
		
//************************ Task-5.8 - Calculate Tax Deducted*************
		
/*		System.out.println("Enter your Salary : ");
		double salary =sc.nextDouble();
		double tax;
		if(salary>=0 && salary < 250000){
			System.out.println("No Tax");
		}
		else if(salary>=250000 && salary<500000) {
			tax=((salary /100)*5) ; 
			System.out.println("Total Tax : "+ tax);
		}
		else if(salary>=500000 && salary <1000000) {
			tax =((salary /100)*20) ;
			System.out.println("Total Tax : "+ tax);
		}
		else if(salary>=1000000) {
			tax = ((salary /100)*30) ;
			System.out.println("Total Tax : "+ tax);
		}
		else {
			System.out.println("Salary should be in positive number");
		}
*/ 		
	}
}
