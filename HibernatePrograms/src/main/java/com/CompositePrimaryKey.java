package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibutils.HibernateUtils;
import com.model.Car;
import com.model.CarId;

public class CompositePrimaryKey {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSession();
		
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		Car car=new Car(new CarId(3,"sjhd382"),"Honda",300000);
		
		session.persist(car);
		
		session.getTransaction().commit();
		System.out.println("Inserted..");
	}
}
