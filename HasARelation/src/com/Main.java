package com;

public class Main {
	public static void main(String[] args) {
		Professor prefessor=new Professor();
		prefessor.setSubject("Embedded Systems");
		prefessor.setExperience(3);
		prefessor.setSalary(25000);
		
		Professor professor1=new Professor("Signals and Systems",4,35000);
		
		
		Department department=new Department();
		department.setDeptName("ECE");
		department.setNumberOfStu(201);
		department.setProfessor(prefessor);
		
		Department department1=new Department("CSE",190,professor1);
		
		
		System.out.println(department1);
		
		Collage collage=new Collage();
		collage.setName("RGUKT");
		collage.setId(827);
		collage.setDepartment(department);
		System.out.println(collage);
		
		
		Collage collage1=new Collage("SSV",1091,new Department("Mechanical",100,new Professor("Mechanics",2,45000)));
		System.out.println(collage1);
	}
}
