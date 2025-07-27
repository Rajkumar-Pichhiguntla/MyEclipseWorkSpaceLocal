package com.example.car;

public class Car {
	 String color;
	 Engine engine;
	
	
	public Car(Engine engine) {
		System.out.println("engine");
	}
	


//	public Car(String color, Engine engine) {
//		super();
//		this.color = color;
//		this.engine = engine;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public Engine getEngine() {
//		return engine;
//	}
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//	
	@Override
	public String toString() {
		return "Car [color=" + color + ", engine=" + engine + "]";
	}

}
