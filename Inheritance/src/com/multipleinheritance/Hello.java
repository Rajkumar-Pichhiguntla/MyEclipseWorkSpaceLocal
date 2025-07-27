package com.multipleinheritance;


// Multiple Inheritance cannot obtain with classes
class Hello {
	void display() {
		System.out.println("Im Hello");
	}
}

class Hi {
	void display() {
		System.out.println("Im Hii");
	}
}

class C extends Hello,Hi{
	public static void main(String[] args) {
		C obj=new C();
		obj.display();
	}
}
