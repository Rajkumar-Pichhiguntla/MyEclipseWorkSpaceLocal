package com.streams;

import com.comparator.Address;

public class Employee {
	int id;
	String name;
	int salary;
	String department;
	Address address;
	
	
	public Employee(int id, String name, int salary,String department,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department=department;
		this.address=address;
	}
	
	public int increaseSalary(int salary) {
		return this.salary+=salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + ", address=" + address + "]";
	}
	
	

}
