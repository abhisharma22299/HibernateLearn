package com.HibernateLearn.HibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started!");
		// this helps to get the connection
		Configuration config = new Configuration();

		// specify the path correctly
//        config.configure("com/tut/hibernate.cfg.xml");
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		// create Student Object
		Student s1 = new Student();
		// set the values of the Student class
		s1.setName("Abhi");
		s1.setAge(10);
		s1.setCity("Lucknow");
		s1.setRollnumber(2);

		System.out.println(s1);

		Session session = sf.openSession();

		Transaction sc = session.beginTransaction();
		session.save(s1);
		// session close
		//
		sc.commit();

		session.close();
	}
}
