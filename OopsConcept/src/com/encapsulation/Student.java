package com.encapsulation;

public class Student {

	private int id=1234;
	private String name="Rajkumar";
	
	
	//setters and getter to access private variables
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
}
