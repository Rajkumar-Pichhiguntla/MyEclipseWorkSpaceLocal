package com.example;

public class PracticeProblems {
		public static void main(String[] args) {
			
			//Fibonacci Series
		/*	int n=20;
			int a=0,b=1;
			for(int i=1;i<=n;i++) {
				System.out.print(a+" ");
				
				int next=a+b;
				a=b;
				b=next;
			}
		*/
			
			//Reverse NUmber
			int input=1234;
			int count=0;
			while(input!=0) {
				input=input/10;
				count++;
			}
			System.out.println(count);
			for(int i=1;i<=count;i++) {
				
			}
		}
}
