package com;

public class Professor {
	private String subject;
	private int experience;
	private double salary;
	
	public Professor() {
		
	}
	
	public Professor(String subject, int experience, double salary) {
		this.subject = subject;
		this.experience = experience;
		this.salary = salary;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Professor [subject=" + subject + ", experience=" + experience + ", salary=" + salary + "]";
	}
}
