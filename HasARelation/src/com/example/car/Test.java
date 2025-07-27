package com.example.car;

public class Test {
	
	public static void main(String[] args) {
		
		Engine e=new Engine();
		e.engineType="Fuel";
		e.modelNumber=123;
		System.out.println(e);
		
		
		Car car1=new Car(e);
		car1.engine=e;
		System.out.println(car1);
		
		
		
	}

}
