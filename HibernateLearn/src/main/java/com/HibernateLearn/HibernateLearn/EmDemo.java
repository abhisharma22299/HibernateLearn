package com.HibernateLearn.HibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
         
		Student st=new Student();
		st.setName("A");
		st.setCity("Gzb");
		st.setAge(1);
		st.setRollnumber(1212);
		
		Certificate cft =new Certificate();
	cft.setDuration("as");
	cft.setCourse("hibernate");
	st.setCerti(cft);
	
	
	Session session =sf.openSession();
	Transaction tx=session.beginTransaction() ;
	
	// persist the object
	
	session.save(st);
	
	
	
	tx.commit();
	sf.close();
	session.close();
	}
}
