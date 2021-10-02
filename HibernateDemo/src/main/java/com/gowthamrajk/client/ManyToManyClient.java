package com.gowthamrajk.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.gowthamrajk.manytomany.Cab;
import com.gowthamrajk.manytomany.CabUser;

public class ManyToManyClient {

	public static void main(String[] args) {

		CabUser user1 = new CabUser(1, "gowtham", "gowtham@gmail.com", 1234512345, "CBE");
		CabUser user2 = new CabUser(2, "raj", "raj@gmail.com", 1122334455, "CHE");
		
		Cab cab1 = new Cab(11, "UBER", "Mini", 250);
		Cab cab2 = new Cab(12, "OLA", "Sedan", 280);
		Cab cab3 = new Cab(13, "RED TAXI", "Micro", 230);
		
		user1.getCabList().add(cab1);
		user1.getCabList().add(cab2);
		user2.getCabList().add(cab2);
		user2.getCabList().add(cab3);
		
		cab1.getUserList().add(user1);
		cab2.getUserList().add(user1);
		cab2.getUserList().add(user2);
		cab3.getUserList().add(user2);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(user1);
		session.save(user2);
		session.save(cab1);
		session.save(cab2);
		session.save(cab3);
		
		Cab cab = (Cab)session.get(Cab.class, 12);
		System.out.println("\n\n Cab : " + cab + "\n");
		System.out.println("\n" + cab.getUserList() + "\n");
		
		CabUser cabUser = (CabUser)session.get(CabUser.class, 2);
		System.out.println("\n\n User : " + cabUser + "\n");
		System.out.println("\n" + cabUser.getCabList() + "\n");
		
		Query query = session.createQuery("Update CabUser e set e.userName = 'RajKumar', e.mobile = '1234567891' where e.cabUserId = 2");
		query.executeUpdate();
		
		transaction.commit();
		session.close();
		
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		List<CabUser> users = new ArrayList<>();
		users = session.createQuery("from CabUser").list();
		System.out.println("\nAfter Updating :\n");
		System.out.println(users + "\n\n");
		
		Query query1 = session.createQuery("delete from CabUser c where c.cabUserId = :userid");
		query1.setInteger("userid", 2);
		query1.executeUpdate();
		
		users.clear();
		users = session.createQuery("from CabUser").list();
		System.out.println("\nAfter Deleting :\n");
		System.out.println(users + "\n\n");

		transaction.commit();
		session.close();
	}
}
