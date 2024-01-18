package com.mapp;
import com.mapp.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		// creating object of question
		Question q=new Question();
		// Questions
		q.setQuestionId(1);
		q.setQuestion("What is your name!");
		
		// Answers 1
		Answer a=new Answer();
		a.setAnswerId(11);
		a.setAnswer("Hello World!");
		a.setQuestion(q);
		
		// Answers 2
		Answer a2=new Answer();
		a2.setAnswerId(111);
		a2.setAnswer("world");
		a2.setQuestion(q);
		
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a);
		list.add(a2);
	
		q.setAnswers(list);
		// session
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(q);
		session.save(a);
		session.save(a2);
		//	session.save(list);
		
		// fetch the data
		Question question=(Question)session.get(Question.class, 1);
		System.out.println(q.getQuestion());
		for(Answer answer:q.getAnswers()) {
				System.out.println(answer.getAnswer());
			
		}
		tx.commit();
	session.close();
		sf.close();
	}

}