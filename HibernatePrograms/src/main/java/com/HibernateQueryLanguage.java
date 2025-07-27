package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.hibutils.HibernateUtils;
import com.model.Student;

public class HibernateQueryLanguage {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSession();
		Session session=sessionFactory.openSession();
		
		
//		getTotalData(session);
		
//		getDataById(session);
		
		insertData(session);
		
//		updateData(session);
		
//		deleteData(session);
	}

	private static void deleteData(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("delete from Student where stu_id=?1");
		query.setParameter(1, 102);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Deleted..");
	}

	private static void updateData(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("update Student set stu_name=?1 where stu_id=?2");
		query.setParameter(1, "Lalli");
		query.setParameter(2, 102);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Updated...");
	}

	private static void insertData(Session session) {
		session.beginTransaction();
//		MutationQuery query = session.createMutationQuery("insert into Student(stu_name,stu_marks) values(?1,?2)");
		MutationQuery query = session.createMutationQuery("insert into Student(stu_name,stu_marks) values(:name,:marks)");
//		query.setParameter(1, 103);
		query.setParameter("name", "Anil");
		query.setParameter("marks", 90);
		query.executeUpdate();
		System.out.println("inserted..");
		session.getTransaction().commit();
	}

	private static void getDataById(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("From Student where id=?1",Student.class);
		SelectionQuery<Student> student = query.setParameter(1, 101);
		List<Student> list = student.list();
		System.out.println(list);
	}

	private static void getTotalData(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("From Student",Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}

}
