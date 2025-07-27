package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOperations {
	public static void main(String[] args) {
		
		Set<Students> student=new HashSet<Students>();
		
		student.add(new Students(1,"AAA"));
		student.add(new Students(2,"BBB"));
		student.add(new Students(2,"BBB"));
		
		System.out.println(student);
		System.out.println("--------------------------------");
		Students stu1=new Students(1,"AAA");
		Students stu2=new Students(2,"BBB");
		Students stu3=new Students(2,"BBB");
		
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		System.out.println(student);
		
		System.out.println("--------------------------------");
		
		Set<Integer> nulls=new HashSet<Integer>();
		
		nulls.add(5);
		nulls.add(null);
		nulls.retainAll(nulls)
		System.out.println(nulls);
	}

}

class Students{
	int id;
	String name;
	
	
	public Students() {
		super();
	}
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}