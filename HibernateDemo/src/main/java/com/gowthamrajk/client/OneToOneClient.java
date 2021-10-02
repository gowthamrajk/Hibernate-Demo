package com.gowthamrajk.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gowthamrajk.onetomany.Question;
import com.gowthamrajk.onetoone.Car;
import com.gowthamrajk.onetoone.Engine;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Car car1 = new Car(101, "Amaze", "Honda", 600000);
		Engine engine1 = new Engine(1234, "Ivtec", 1500);
		car1.setEngine(engine1);
		engine1.setCar(car1);
		
		Car car2 = new Car(102, "Accent", "Hyundai", 600000);
		Engine engine2 = new Engine(1122, "CRDI", 1800);
		car2.setEngine(engine2);
		engine2.setCar(car2);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.persist(car1);
		session.persist(car2);
		
		List<Car> cars = new ArrayList<>();
		cars = session.createQuery("from Car").list();
		System.out.println("\nAfter Inserting :\n");
		System.out.println(cars + "\n\n");
		
		//session.save(car1);
		//session.saveOrUpdate(car2);
		//session.delete(car2);
		
		
		transaction.commit();
		session.close();
	}

}
