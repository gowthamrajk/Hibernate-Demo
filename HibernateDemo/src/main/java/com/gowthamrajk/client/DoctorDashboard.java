package com.gowthamrajk.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gowthamrajk.jpapersistence.Doctor;

public class DoctorDashboard {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("doctorDatabase");  
        EntityManager entityManager = entityManagerFactory.createEntityManager();    
        EntityTransaction transaction = entityManager.getTransaction();  
        transaction.begin();
        
        Doctor doctor1 = new Doctor(101, "doctor1", "doctor1@gmail.com", "ENT", 10);
        Doctor doctor2 = new Doctor(102, "doctor2", "doctor2@gmail.com", "CARDIOLOGY", 15);
        Doctor doctor3 = new Doctor(103, "doctor3", "doctor3@gmail.com", "GYNACOLOGY", 8);
        
        entityManager.persist(doctor1);
        entityManager.persist(doctor2);
        entityManager.persist(doctor3);
        
        transaction.commit();
        entityManager.close();
        
	}

}
