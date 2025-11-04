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
		Employee e1=(Employee)s.get(Employee.class, 11);
		
		if(e1!=null){
			System.out.println(e1);
			s.delete(e1);
			System.out.println("Record is Deleted....");
		}else{
			System.out.println("No Record for Deleting...");
		}
		t.commit();
		s.close();
		sf.close();
		System.out.println("All done check DB..");
		
	}

}
