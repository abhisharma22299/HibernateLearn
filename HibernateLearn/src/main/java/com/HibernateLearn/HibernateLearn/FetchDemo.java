package com.HibernateLearn.HibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

public static void main(String []args) {
	// get,load
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	// get -student:6
	Student st=(Student)session.get(Student.class, 2);
	Student st2=(Student)session.load(Student.class, 2);
	System.out.println(st);
	System.out.println(st2);
	// session factory close
	sf.close();
}
}
