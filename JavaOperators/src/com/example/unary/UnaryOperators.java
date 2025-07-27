package com.example.unary;

public class UnaryOperators {
	public static void main(String[] args) {
		
		short a = 18;
		short b = -20;
		
		boolean isEligible=true;
		
		
		
		System.out.println("Plus Operation on a : " + +a);
		
		System.out.println("Negative operation on b : " + -b);
		
		System.out.println("Not operation on isEligible : " + !isEligible);
		
		//Post Increment
		
		System.out.println("Post Increment :");
		
		System.out.println(a++ + a++ + a++);
		a++ ;
		System.out.println(a);
		
		//pre increment
		System.out.println("Pre Increment :");
		
		++a;
		System.out.println(a);
		System.out.println(++a + ++a);
		
		System.out.println(a);
		
		//Pre-decrement
		System.out.println(b);
		
		--b;
		System.out.println(b);
		System.out.println(--b - --b);
		System.out.println(b);
		
		//Post-decrement
		System.out.println(b);
			
		b--;
	    System.out.println(b);
		System.out.println(b-- - b--);
		System.out.println(b);
				
//		int d=3,f=4,g=6;
//		g=d++ * f-- + ++d * --f + d *f;
//		System.out.println("d="+d);
//		System.out.println("f="+f);
//		System.out.println("g="+g);
		
//		int d=5,f=2,g;
//		g=(d++ * f--) - (d-- + ++f)+ d * ++f;
//		System.out.println("d="+d);
//		System.out.println("f="+f);
//		System.out.println("g="+g);
		
		int d=10;
		int f=5;
		System.out.println(d++ + --f * d++ - --d + ++f);
		
		
		
		
	}

}
