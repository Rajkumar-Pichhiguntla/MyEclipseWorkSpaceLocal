package com.inheritance;

public class Test {

		public static void main(String[] args) {
			
			Dog d=new Dog();
			System.out.println(d.breed);
			d.makeSound();
			d.bark();
			
			Husky hs=new Husky();
			hs.bark();
			hs.speed(); 
			
			GermanSephard gs=new GermanSephard();
			gs.makeSound();
			gs.bark();
			gs.color();
			
			Car c=new Car();
			System.out.println(c.vehilceNo);
			c.start();
		}
}
