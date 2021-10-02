package com.gowthamrajk.cachingexample;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingClient {

	public static void main(String[] args) {

		UserDetails userDetails1 = new UserDetails(101, "Gowtham", "gowtham@gmail.com", 1234512345);
		UserDetails userDetails2 = new UserDetails(102, "raj", "raj@gmail.com", 1122334455);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		UserDetails userObj1 = (UserDetails)session.get(UserDetails.class, 101);
		
		transaction.commit();
		session.close();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		UserDetails userObj2 = (UserDetails)session.get(UserDetails.class, 101);

		transaction.commit();
		session.close();
	}
}
