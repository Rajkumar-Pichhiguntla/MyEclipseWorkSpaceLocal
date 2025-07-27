package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employees;
import com.utils.HibernateUtil;

public class Application {
	public static void main(String[] args) {
//		getData();
		insertData();
//		updateData();
//		deleteData();
		
	}
	public static void insertData() {
		SessionFactory sessionFactory=HibernateUtil.getSession();
		Session session=sessionFactory.openSession();
		
		Employees emp=new Employees("ssfsAF@gmail.com",24000);
		session.beginTransaction();
		session.persist(emp);
		session.getTransaction().commit();
		System.out.println("Inserted..");
	}
	
	public static void getData() {
		SessionFactory sessionFactory=HibernateUtil.getSession();
		Session session=sessionFactory.openSession();
		Employees employee=session.find(Employees.class, 101);
		System.out.println(employee);
	}
	
	public static void updateData() {
		SessionFactory sessionFactory=HibernateUtil.getSession();
		Session session=sessionFactory.openSession();
		Employees emp=session.find(Employees.class, 102);
		emp.setSalary(35000);
		
		session.beginTransaction();
//		session.merge(emp);
		session.getTransaction().commit();
		System.out.println("Updated..");
	}
	
	public static void deleteData() {
		SessionFactory sessionFactory=HibernateUtil.getSession();
		Session session=sessionFactory.openSession();
		Employees emp=session.find(Employees.class, 252);
		session.beginTransaction();
		session.remove(emp);
		session.getTransaction().commit();
		System.out.println("Deleted..");
	}
}
