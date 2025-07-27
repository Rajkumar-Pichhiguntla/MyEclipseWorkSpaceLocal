package com;

public class Collage {
	
	private String name;
	private int id;
	private Department department;
	

	Collage(){
		
	}

	public Collage(String name, int id,Department department) {
		this.name = name;
		this.id = id;
		this.department=department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Collage [name=" + name + ", id=" + id + ", department=" + department + "]";
	}

	


}
