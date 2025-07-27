package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Passport;
import com.model.User;
import com.utils.HibernateUtils;

public class OneToOneMapping {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		
//		insert(session);
		
//		select(session);
		
		update(session);
//		delete(session);
		
	}

	private static void delete(Session session) {
		session.beginTransaction();
		User user = session.find(User.class, 4);
		session.remove(user);
		session.getTransaction().commit();
		System.out.println("Deleted..");
	}

	private static void update(Session session) {
		session.beginTransaction();
		User user = session.find(User.class, 4);
		Passport pass=session.find(Passport.class, user.getPassport().getPassNumber());
		user.setUserName("Anil");
		pass.setIssuedPlace("Banglore");
//		user.setPassport(pass);
		session.merge(user);
		session.getTransaction().commit();
	}

	private static void select(Session session) {
//		User user = session.find(User.class, 4);
		Passport pass=session.find(Passport.class, 1001);
//		System.out.println(user);
		System.out.println(pass);
		System.out.println(pass.getUser());
	}

	private static void insert(Session session) {
//		User user=new User("Srikanth",new Passport(1003,"Hyd"));
		
		
		session.beginTransaction();
		User user=new User("Ashok");
		Passport pass=new Passport(1005,"Vizag");
		user.setPassport(pass);
		pass.setUser(user);
		
		session.persist(user);
		session.getTransaction().commit();
		System.out.println("Inserted..");
	}

}
