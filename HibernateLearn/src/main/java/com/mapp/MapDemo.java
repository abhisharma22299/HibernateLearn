package com.mapp;
import com.mapp.*;
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
		q.setQuestionId(1);
		q.setQuestion("What is your name!");
		
		Answer a=new Answer();
		a.setAnswerId(11);
		a.setAnswer("Hello World!");
		a.setQuestion(q);
		
		q.setAnswer(a);
		
		// session
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(q);
		session.save(a);
		tx.commit();
		
		// fetching the 
	Question nQ= (Question)session.get(Question.class, 1);
	System.out.println(nQ.getQuestion());
	System.out.println(nQ.getAnswer().getAnswer());
	
	Answer nA=session.get(Answer.class,11);
	System.out.println(nA.getQuestion().getQuestion());
	System.out.println(nA.getAnswer());
		session.close();
		sf.close();
	}

}
