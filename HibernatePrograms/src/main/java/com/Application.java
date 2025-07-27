package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibutils.HibernateUtils;
import com.model.Student;

public class Application {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSession();
		Session session = sessionFactory.openSession();
		
//		insertData(session);
		
//		getDataWithSelect(session);
	
		
		update(session);
		
//		deleteData(session);
		
	}

	private static void deleteData(Session session) {
		session.beginTransaction();
		Student student = session.find(Student.class, 0);
		session.remove(student);
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		Student stu = session.find(Student.class, 102);
//		stu.setStu_id(103);
		stu.setStu_name("Rupa");
		stu.setStu_marks(100);
		session.merge(stu);
		session.getTransaction().commit();
	}

	private static void getDataWithSelect(Session session) {
		Student student = session.find(Student.class, 101);
		System.out.println(student);
	}

	private static void insertData(Session session) {
		session.beginTransaction();
		Student student=new Student(101,"Raj",95);
		session.persist(student);
		session.getTransaction().commit();
		System.out.println("Inserted..");
	}
}
