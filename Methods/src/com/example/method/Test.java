package com.example.method;

public class Test {
	public static void main(String[] args) {
		
		Test t=new Test();
		int result=t.sum(10,20);
		t.div(result);
		
	}
	
	int sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	void div(int d) {
		System.out.println(d/2);
	}
	
	void primeNumber(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
	}
}
