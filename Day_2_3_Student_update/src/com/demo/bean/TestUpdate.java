package com.demo.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		student e1=(student)s.get(student.class, 4);
		
		if(e1!=null){
			System.out.println(e1);
			e1.setPercentage(99.9);
			s.update(e1);
			System.out.println("Record is Updated....");
		}else{
			System.out.println("No Record for Update...");
		}
		t.commit();
		s.close();
		sf.close();
		System.out.println("All done check DB..");
		
		
	}

}
