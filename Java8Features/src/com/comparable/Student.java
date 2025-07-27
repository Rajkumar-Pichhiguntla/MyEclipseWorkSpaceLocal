package com.comparable;

public class Student implements Comparable<Student> {
	int id;
	String name;
	
	public Student() {
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student stu) {
		
//		return (this.id==stu.id)? 0 :(this.id < stu.id)? -1 : 1;
		
//		return this.name.compareTo(stu.name);//comapreTo Come from string class thats why we using name(String type)
		
		return Integer.compare(this.id, stu.id);
		}
	
	
	
	
}
