package com.hibutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Car;
import com.model.CarId;
import com.model.Student;

public class HibernateUtils {
	public static SessionFactory sessionFactory=null;
	public static SessionFactory getSession() {
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Car.class);
			cfg.addAnnotatedClass(CarId.class);
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory; 
		}
		return sessionFactory;
	}
	

}
