package com.HibernateLearn.HibernateLearn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started!" );
        // this helps to get the connection 
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
      SessionFactory sf	=config.buildSessionFactory();
   System.out.println(sf);
    }
}
