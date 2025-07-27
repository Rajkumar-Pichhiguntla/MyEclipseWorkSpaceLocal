package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.hibutils.HibernateUtils;
import com.model.Student;

public class NativeQueries {
	private static MutationQuery createNamedMutationQuery;

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSession();
		Session session = sessionFactory.openSession();
		
		
//		selectAll(session);
		
//		insertData(session);
		
//		updateData(session);
		
//		delete(session);
		
//		session.createNativeQuery("select max(marks) from students group by marks");

	}

	private static void delete(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("delete from students where name=?");
		
		query.setParameter(1, "pavan");
		query.executeUpdate();
		System.out.println("deleted..");
		session.getTransaction().commit();
	}

	private static void updateData(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("update students set marks=? where id=?");
		query.setParameter(1, 90);
		query.setParameter(2, 106);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insertData(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("insert into students(name,marks) values(?,?)");
		query.setParameter(1, "Naga");
		query.setParameter(2, 96);
		query.executeUpdate();
		System.out.println("Inserted..");
		session.getTransaction().commit();
	}

	private static void selectAll(Session session) {
		NativeQuery<Student> query = session.createNativeQuery("select * from Students",Student.class);
		
		List<Student> list = query.list();
		System.out.println(list);
	}

}
