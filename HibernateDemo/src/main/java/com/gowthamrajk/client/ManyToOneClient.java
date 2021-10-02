package com.gowthamrajk.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gowthamrajk.manytomany.CabUser;
import com.gowthamrajk.manytoone.Owner;
import com.gowthamrajk.manytoone.Vehicle;

public class ManyToOneClient {
	
	public static void main(String[] args) {
		
		Owner owner = new Owner("Gowtham", "CBE", 1234512345);
		
		Vehicle vehicle1 = new Vehicle("Honda Amaze");
		vehicle1.setOwner(owner);
		
		Vehicle vehicle2 = new Vehicle("Accent");
		vehicle2.setOwner(owner);
		
		Vehicle vehicle3 = new Vehicle("BMW");
		vehicle3.setOwner(owner);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
	    session.save(owner);
	    
	    //Vehicle vehicle = (Vehicle)session.get(Vehicle.class, 1);
	    //System.out.println("\n\n" + vehicle + "\n\n");
	    
	    List<Vehicle> vehicles = new ArrayList<>();
	    vehicles = session.createQuery("from Vehicle").list();
		System.out.println("\nAfter Inserting :\n");
		System.out.println(vehicles + "\n\n");		

		// session.save(vehicle1);
		// session.saveOrUpdate(vehicle2);
		// session.delete(vehicle2);
		
		transaction.commit();
		session.close();
	}

}
