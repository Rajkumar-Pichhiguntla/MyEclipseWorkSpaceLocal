package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
	
	public static void main(String[] args) {
		
		Student st1=new Student(1,"Raj");
		Student st2=new Student(2,"Pavan");
		Student st3=new Student(3,"Vishnu");
		Student st4=new Student(4,"Gaja");
		
		
		ArrayList<Student> students=new ArrayList();
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		System.out.println(students);
		
		System.out.println("---------------------------------------");
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		for(Student student:students){
			System.out.println(student);
		}
		
		System.out.println("---------------------------------------");
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student);
		}
		
		
		System.out.println("---------------------------------------");
		
		ListIterator<Student> listIterator = students.listIterator();
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasNext());
		
	}
}

class Student{
	int id;
	String name;
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
	
	
}
