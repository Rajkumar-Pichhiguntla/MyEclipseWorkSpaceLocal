package com.example.arithmetic;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int myNum1=20;
		int myNum2=10;
		
		float myFloatNum = 23.5f;
		
		
		int add = myNum1+myNum2;
		int sub = myNum1-myNum2;
		int mul = myNum1*myNum2;
		
		int div = myNum1/myNum2;
		
		int mod = myNum1%myNum2;
		
		
		System.out.println(myNum1 + "+" + myNum2 + "-->" + add);
		System.out.println(myNum1+ "-" + myNum2 + "-->" + sub);
		System.out.println(myNum1 + "*" + myNum2 + "-->" + mul);
		System.out.println(myNum1 + "/" + myNum2 + "-->" + div);
		
		System.out.println(myNum1 + "%" + myNum2 + "-->" + mod);
		
		
		
		//one integer and one float
		
		
		System.out.println(myNum1 + "+" + myFloatNum + "-->"+(myNum1+myFloatNum));
		System.out.println(myNum1 + "+" + myFloatNum + "-->"+(myNum1-myFloatNum));
		System.out.println(myNum1 + "+" + myFloatNum + "-->"+(myNum1/myFloatNum));
		System.out.println(myNum1 + "+" + myFloatNum + "-->"+(myNum1*myFloatNum));
		System.out.println(myNum1 + "+" + myFloatNum + "-->"+(myNum1%myFloatNum));
		
		
	}
}
