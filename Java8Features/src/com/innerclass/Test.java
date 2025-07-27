package com.innerclass;

public class Test {
	
	public static void main(String[] args) {
	
		Bike bike=new Bike();
		
		bike.start();
		bike.stop();
		
		Vehicle lorry=new Vehicle() {

			@Override
			public void start() {
				System.out.println("Lorry started..");
				
			}

			@Override
			public void stop() {
				System.out.println("lorry stopped");
				
			}
			
			public void brake() {
				System.out.println("driving lorry..");
			}
		};
		
		lorry.start();
		lorry.stop();
		lorry.drive();
		
}
}
