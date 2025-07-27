package com.multipleinheritance;

public class Dog extends Animal implements Pet {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();
	}

	@Override
	public void sound() {
		System.out.println("Bark");
		
	}
}

abstract class Animal{
	abstract void sound();
}

interface Pet{
	void sound();
}
