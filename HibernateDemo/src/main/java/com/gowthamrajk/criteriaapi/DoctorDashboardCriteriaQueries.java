package com.gowthamrajk.criteriaapi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.gowthamrajk.jpapersistence.Doctor;

public class DoctorDashboardCriteriaQueries {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Doctor doctor4 = new Doctor(104, "doctor4", "doctor4@gmail.com", "DENTAL", 13);
		Doctor doctor5 = new Doctor(105, "doctor5", "doctor5@gmail.com", "PEADEATRITION", 25);
		Doctor doctor6 = new Doctor(106, "doctor6", "doctor6@gmail.com", "SKIN CARE", 12);
		
		session.save(doctor4);
		session.save(doctor5);
		session.save(doctor6);		
		
		Criteria criteriaObj = session.createCriteria(Doctor.class);
		
		System.out.println("\n<=>Restrictions<=>\n");
		criteriaObj.add(Restrictions.eq("doctorId", 105));
		System.out.println(criteriaObj.list());
	
		//criteriaObj.add(Restrictions.gt("experience", 12));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.lt("experience", 20));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.like("doctorName", "%4"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.ilike("doctorName", "DO_T__6"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.between("doctorId", 101, 110));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.isNull("doctorName"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.isNotNull("specialization"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.add(Restrictions.isEmpty("email"));
		//System.out.println(criteriaObj.toString());
		
		//criteriaObj.add(Restrictions.isNotEmpty("experience"));
		//System.out.println(criteriaObj.toString());
		
		//System.out.println("\n<=>Logical Expression<=>\n");
		//Criterion experienceObj = Restrictions.ge("experience", 13);
		//Criterion nameObj = Restrictions.like("doctorName", "%5");
		//LogicalExpression expression1 = Restrictions.or(experienceObj, nameObj);
		//LogicalExpression expression1 = Restrictions.and(experienceObj, nameObj);
		//criteriaObj.add(expression1);
		//System.out.println(criteriaObj.list());
		
		//System.out.println("\n<=>Pagenation<=>\n");
		//criteriaObj.setFirstResult(1);
		//criteriaObj.setMaxResults(3);
		//System.out.println(criteriaObj.list());
		
		//System.out.println("\n<=>Sorting<=>\n");
		//criteriaObj.addOrder(Order.asc("experience"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.addOrder(Order.desc("experience"));
		//System.out.println(criteriaObj.list());
		
		//System.out.println("\n<=>Projections<=>\n");
		//criteriaObj.setProjection(Projections.rowCount());
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.setProjection(Projections.min("experience"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.setProjection(Projections.max("experience"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.setProjection(Projections.sum("experience"));
		//System.out.println(criteriaObj.list());
		
		//criteriaObj.setProjection(Projections.avg("experience"));
		//System.out.println(criteriaObj.list());
		
		criteriaObj.setProjection(Projections.countDistinct("doctorName"));
		System.out.println(criteriaObj.list());
		
		transaction.commit();
		session.close();
		
	}

}
