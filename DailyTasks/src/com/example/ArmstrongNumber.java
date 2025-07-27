package com.example;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num : ");
		int num=sc.nextInt();
		
		int temp=num;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		
		
		int result=0;
		temp=num;
		while(temp>0) {
			int digit=temp%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*digit;
			}
			result=result+power;
			temp=temp/10;
		}

		
		if(result==num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
		
	}
	

}






/*
for(int i=2;i<num;i++) {
	boolean isPrime=true;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(i+"");
	}
}
*/