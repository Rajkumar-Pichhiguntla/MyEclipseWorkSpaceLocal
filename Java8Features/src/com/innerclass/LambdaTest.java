package com.innerclass;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		
		LambdaClass add=new LambdaClass();
		add.add(10, 20);
		
		LambdaInterface add2=(a,b)->{
			System.out.println(a+b);
			};
		add2.add(20, 30);
		
		
		Calculator calc=(a,b)->{
		return a+b;};
		System.out.println(calc.add(20, 30));
		
		
		/*LambdaClass lb=new LambdaClass();
		lb.sayHi();
		
		LambdaInterface anonymousClass=new LambdaInterface() {

			@Override
			public void sayHi() {
				System.out.println("Hello..Anonymous Class");
				
			}
			
		};
		
		anonymousClass.sayHi();
		
		LambdaInterface lambdaEx=()->{System.out.println("Hello..Lambda Expression..");};
		LambdaInterface lambdaAddition=()->{System.out.println();};

		
		lambdaEx.sayHi();*/
		
		
		
		Runnable thread1=new Thread2();
		Thread thread2=new Thread(thread1);
		thread2.start();
		
	}

}

class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Started Thread");
		
	}
	
}
