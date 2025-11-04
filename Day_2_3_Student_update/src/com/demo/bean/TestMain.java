package com.demo.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		student e1=new student(4, "DEF", 94.5,"03/03/2001");
		s.save(e1);
		t.commit();
		s.close();
		sf.close();
		System.out.println("All done check DB..");
		
	}

}
