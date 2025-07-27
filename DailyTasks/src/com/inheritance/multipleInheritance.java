package com.inheritance;

public class multipleInheritance {
	public static void main(String[] args) {
		
		Son s=new Son();
		s.height();
	}
}

abstract class  Father{
	
	abstract void height();
}

abstract class Mother{
	void skinColor() {
		System.out.println("Skin color Dark");
	}
	abstract void height();
}

 class Son extends Father,Mother{
	
	void voice() {
		System.out.println("Base voice..");
	}

	@Override
	void height() {
		// TODO Auto-generated method stub
		
	}
}

