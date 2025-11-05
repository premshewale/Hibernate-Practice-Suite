package com.demo.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		Address a1=new Address("Mumbai","400001");
		Employee e1=new Employee("XYZ",a1);
		s.save(a1);
		s.save(e1);
		t.commit();
		s.close();
		sf.close();
		System.out.println("All done check DB..");
	}

}
