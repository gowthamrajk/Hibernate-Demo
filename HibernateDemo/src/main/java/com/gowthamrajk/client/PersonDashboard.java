package com.gowthamrajk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.gowthamrajk.model.Address;
import com.gowthamrajk.model.Person;
import java.util.List;
import java.util.ArrayList;

public class PersonDashboard {

	public static void main(String[] args) {
		
		Person person = new Person(101, "gowtham", 21, "gowtham@gmail.com", 1234567891);
		Person person1 = new Person(101, "gowthamraj", 21, "gowthamraj@gmail.com", 1122334455);
		Address address = new Address("2/8", "abc", "poy", "tn", 642002);
		person.setAddress(address);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(person);
		//session.save(person1);
		//session.saveOrUpdate(person1);
		//session.delete(person);
		
		List<Person> persons = new ArrayList<>();
		persons = session.createQuery("FROM Person").list();
		System.out.println("\n" + persons + "\n");
		
		transaction.commit();
		session.close();
	}

}
