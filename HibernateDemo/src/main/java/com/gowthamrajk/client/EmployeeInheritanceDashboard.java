package com.gowthamrajk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gowthamrajk.model.Developer;
import com.gowthamrajk.model.Employee;
import com.gowthamrajk.model.Tester;

public class EmployeeInheritanceDashboard {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "superemployee", 50000, "superemp@gmail.com", 1122334455);
		
		Developer developer = new Developer(11, "developer1", "Delivery", 10);
		developer.setEmpId(101);
		developer.setEmpName("employee1");
		developer.setSalary(40000.00);
		developer.setEmail("employee1@gmail.com");
		developer.setMobile(1234512345);
		
		Tester tester = new Tester(12, "tester1", "Q&A", 5);
		tester.setEmpId(102);
		tester.setEmpName("employee2");
		tester.setSalary(30000.00);
		tester.setEmail("employee2@gmail.com");
		tester.setMobile(1234567891);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(developer);
		session.save(tester);
		session.save(employee);

		
		transaction.commit();
		session.close();
	}
}
