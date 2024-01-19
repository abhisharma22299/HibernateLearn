package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		emp1.setEid(1);
		emp1.setName("Abhi");

		emp2.setEid(2);
		emp2.setName("Abhi_sharma");

		Project pro = new Project();
		Project pro1 = new Project();
		pro.setPid(1);
		pro.setName("HTML");
		pro1.setPid(2);
		pro1.setName("css");
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		list1.add(emp2);
		list1.add(emp1);

		list2.add(pro);
		list2.add(pro1);

		emp1.setProjects(list2);

		pro.setEmps(list1);

		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(pro);
		session.save(pro1);
		
		
		
		tran.commit();
		session.close();
		sf.close();
	}
}
