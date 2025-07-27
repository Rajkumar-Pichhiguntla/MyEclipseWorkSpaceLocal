package com.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import com.model.Student;

public class StudentOperations {
	Scanner sc=new Scanner(System.in);
	
	public void addStudent(ArrayList<Student> student) {
		System.out.println("Enter Student Id :");
		int stuId=sc.nextInt();
		System.out.println("Enter Name :");
		String stuName=sc.next();
		System.out.println("Enter Marks :");
		int marks=sc.nextInt();
		Student s=new Student(stuId,stuName,marks);
		student.add(s);
//		System.out.println(student);
	}
	
	public void updateStudent(ArrayList<Student> students) {
		System.out.println("Enter Student ID to Update:");
		int stuId=sc.nextInt();
		Optional<Student> student=students.stream().filter((stu)-> stu.getId()==stuId).findFirst();
		if(student.isPresent()) {
			Student s=student.get();
			System.out.println("Enter New Name :");
			String stuNewName=sc.next();
			s.setName(stuNewName);
			System.out.println("Enter new Marks :");
			int newMarks=sc.nextInt();
			s.setMarks(newMarks);
			
		}
		else {
			System.out.println("Student Not Found");
		}
		
		
	}

}
