package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		
		Student st1=new Student(10,"XXXX");
		Student st2=new Student(2,"YYYY");
		Student st3=new Student(3,"TTTT");
		Student st4=new Student(45,"ZZZZ");
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		System.out.println(st1.compareTo(st4));
	}
}
