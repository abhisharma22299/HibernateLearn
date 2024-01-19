package com.HibernateLearn.HibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	public static void main(String[] args) {
		// Practical of Hibernate Object States
		// Transient
		// Persistence
		// Detached
		// Removed
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student student = new Student();
		student.setRollnumber(23);
		student.setName("AS");
		student.setCity("GG");
		// student transient state
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		// student :persistent state : associated with session , database
		session.save(student);
		student.setName("John");
		t.commit();
		sf.close();
		
		
	}
}
