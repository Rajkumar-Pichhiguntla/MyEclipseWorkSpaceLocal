package com;

public class Person implements Cloneable{
	

	int age;
	String name;
	
	public Person(){
		
	}
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Person person=(Person)obj;
		return this.age==person.age && this.name.equals(person.name);
		
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
