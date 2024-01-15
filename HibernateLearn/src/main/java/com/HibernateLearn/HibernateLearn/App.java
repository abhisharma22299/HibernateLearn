package com.HibernateLearn.HibernateLearn;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws Exception {
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
		System.out.println(s1);

		// creating the address class object
		Address ad = new Address();
		ad.setAddedDate(new Date());
		ad.setStreet("street");
		ad.setCity("Lucknow");
		// Reading image
		FileInputStream fis =new FileInputStream("src/main/java/1.PNG");
		byte[] data=new byte[fis.available()];
		fis.read();
		ad.setImage(data);
		ad.setX(12122.21);
		Session session = sf.openSession();

		Transaction sc = session.beginTransaction();
		session.save(s1);
		session.save(ad);
		// session close
		//
		sc.commit();

		session.close();
		System.out.println("Done....");
	}
}
