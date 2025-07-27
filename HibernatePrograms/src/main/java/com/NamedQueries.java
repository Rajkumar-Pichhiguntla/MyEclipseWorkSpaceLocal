package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hibutils.HibernateUtils;
import com.model.Student;

public class NamedQueries {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSession();
		
		Session session = sessionFactory.openSession();
		
//		insert(session);
		
//		select(session);
		
		session.beginTransaction();
		MutationQuery query = session.createNamedMutationQuery("updateData");
		query.setParameter(1, 100);
		query.setParameter(2, 2);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Query<Student> query = session.createNamedQuery("allStudents", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}

	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNamedMutationQuery("insertData");
		query.setParameter(1, "Ravi");
		query.setParameter(2, 92);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("inserted...");
	}

}
