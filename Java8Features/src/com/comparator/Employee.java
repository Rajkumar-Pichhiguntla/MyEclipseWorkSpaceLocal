package com.comparator;

import java.util.Comparator;

public class Employee{
	
	int id;
	String domain;
	String name;
	String company;
	Address address;
	
	
	public Employee() {
		
	}

	public Employee(int id, String domain, String name,String company,Address address) {
		super();
		this.id = id;
		this.domain = domain;
		this.name = name;
		this.company=company;
		this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", domain=" + domain + ", name=" + name + ", company=" + company + ", address="
				+ address + "]";
	}

	
	
	

}
