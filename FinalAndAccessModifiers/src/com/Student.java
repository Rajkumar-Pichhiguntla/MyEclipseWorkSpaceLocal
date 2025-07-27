package com;

import java.util.Objects;

public class Student {
	
	private int id; //Only class level..if you want to use outside use setter nd Getter
	protected String name;  //package level access..if you want to access in another package u have to extends the class with present class
	public int age; //accessible in entire project
	String city; //Defalut modifiers -> Package level access ..use getters to access in different package
	
	protected Student() {
		
	}

	public Student(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	private void checkAge(int age) {
		final int salry=10000;
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible..");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name);
	}
	

}
