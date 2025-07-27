package com.example;

public class Customer {
	private String name;
	private int password;
	public Customer(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + "]";
	}
	
}
