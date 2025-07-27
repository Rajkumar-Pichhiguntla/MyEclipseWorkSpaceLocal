package com;

public class Test{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		extracted();
		
		
		Person per1=new Person(18,"Raj");
		
		
		
		Person per2=(Person) per1.clone();
		System.out.println(per2);
		per1.age=25;
		System.out.println(per1);
		
	}

	private static void extracted() {
		Person person1=new Person();
		person1.age=25;
		person1.name="Rajkumar";
		
		
		Person person2=new Person(30,"Naganna");
		Person person3=new Person();
		person3.setAge(25);
		person3.setName("Rajkumar");
		
		boolean isSame=person3.equals(person1);
		System.out.println(isSame);
//		System.out.println(person1);
//		System.out.println(person3);
	}

}
