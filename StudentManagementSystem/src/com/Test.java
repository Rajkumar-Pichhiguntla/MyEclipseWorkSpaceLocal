package com;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.model.Student;
import com.service.StudentOperations;

public class Test {
	public static void main(String[] args) {
		
		StudentOperations so=new StudentOperations();
		ArrayList<Student> students=new ArrayList<>();
		so.addStudent(students);
		System.out.println(students);
		
		
	}
}
