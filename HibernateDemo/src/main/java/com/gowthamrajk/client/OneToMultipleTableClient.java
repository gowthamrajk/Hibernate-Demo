package com.gowthamrajk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.gowthamrajk.oneclasstomultipletable.Gadget;

public class OneToMultipleTableClient {

	public static void main(String[] args) {

		Gadget gadget = new Gadget(101, "laptop", "very good", 40000, "DELL", 1);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(gadget);
		
		Gadget gadgetObj = (Gadget)session.get(Gadget.class, 101);
		System.out.println(gadgetObj);
		
		transaction.commit();
		session.close();
	}
}
