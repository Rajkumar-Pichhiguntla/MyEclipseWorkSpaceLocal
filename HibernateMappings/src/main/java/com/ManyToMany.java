package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Course;
import com.model.Student;
import com.utils.HibernateUtils;

public class ManyToMany {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		List<Student> students1=new ArrayList<Student>();
		List<Student> students2=new ArrayList<Student>();
		List<Course> courses1=new ArrayList<Course>();
		List<Course> courses2=new ArrayList<Course>();
		
		
		Student stu1=new Student("Raj");
		Student stu2=new Student("Shiva");
		Student stu3=new Student("Srikanth");
		
		
		students1.add(stu1);
		students1.add(stu2);
		students2.add(stu3);
		
		
		
		Course c1=new Course("JFS");
		Course c2=new Course("Linux");
		Course c3=new Course("AI");
		
		courses1.add(c1);
		courses1.add(c2);
		courses2.add(c3);
		
		stu1.setCourse(courses1);
		stu2.setCourse(courses1);
		stu3.setCourse(courses2);
	
		c1.setStudents(students1);
		c2.setStudents(students1);
		c3.setStudents(students2);
		
		c1.setNoOfStudents(c1.getStudents().size());
		c2.setNoOfStudents(c2.getStudents().size());
		c3.setNoOfStudents(c3.getStudents().size());
		session.beginTransaction();
		session.persist(stu1);
		session.persist(stu2);
		session.persist(stu3);
		session.getTransaction().commit();
	}
}
