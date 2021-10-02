package com.gowthamrajk.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gowthamrajk.manytoone.Vehicle;
import com.gowthamrajk.onetomany.Answer;
import com.gowthamrajk.onetomany.Question;

public class OneToManyClient {

	public static void main(String[] args) {

		Question question1 = new Question("How are you ?");	
		Answer q1Answer1 = new Answer("I am fine", "Gowtham");
		Answer q1Answer2 = new Answer("I am good, how about you?", "Raj");
		question1.getAnswers().add(q1Answer1);
		question1.getAnswers().add(q1Answer2);
		
		Question question2 = new Question("Where are you from ?");
		Answer q2Answer1 = new Answer("I am from coimbatore", "kumar");
		Answer q2Answer2 = new Answer("I am from Chennai", "Kavin");
		Answer q2Answer3 = new Answer("I am from Mumbai", "Rohit");
		question2.getAnswers().add(q2Answer1);
		question2.getAnswers().add(q2Answer2);
		question2.getAnswers().add(q2Answer3);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.persist(question1);
		session.persist(question2);
		
		List<Question> questions = new ArrayList<>();
		questions = session.createQuery("from Question").list();
		System.out.println("\nAfter Inserting :\n");
		System.out.println(questions + "\n\n");
		
		// session.save(question1);
		// session.saveOrUpdate(question1);
		// session.delete(question2);

		transaction.commit();
		session.close();
	}
}
