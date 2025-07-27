package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employees;
import com.utils.HibernateUtil;

public class States {
	public static void main(String[] args) {
		SessionFactory sessionFacoty=HibernateUtil.getSession();
		Employees emp=new Employees(152,"umesh@gmail.com",45000); //Transient state
		Session session=sessionFacoty.openSession();
		
		session.beginTransaction();
		session.persist(emp);//Persistent state
		emp.setSalary(48000);
		session.getTransaction().commit();
		
		session.close();
		emp.setSalary(48000);//detached state
	}

}
