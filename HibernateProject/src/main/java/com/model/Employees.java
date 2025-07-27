package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column(name="empEmail")
	private String email;
	@Column(name="empSalary")
	private double salary;
	
	public Employees() {
		
	}

	public Employees(int empId, String email, double salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.salary = salary;
	}

	public Employees(String email, double salary) {
		this.email=email;
		this.salary=salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}
	
	

}
