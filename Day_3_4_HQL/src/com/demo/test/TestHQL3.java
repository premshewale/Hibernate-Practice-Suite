package com.demo.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Product;

public class TestHQL3 {

Session s;
	
	public TestHQL3(){
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		s=sf.openSession();
	}
		public void ShowProduct(){
			Transaction t= s.beginTransaction();
			
			Query query =s.createQuery("select ProdName,Category,Price,Quantity"
					+ " from Product where price>? and Quantity<:qty");
			query.setInteger(0, 70);
			query.setInteger("qty", 100);
			List list=query.list();
			
			for(int i=0;i<list.size();i++){
				
				Object obj[]=(Object[])list.get(i);
				System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]);
			}
				
			t.commit();
			s.close();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestHQL3 t1= new TestHQL3();
		t1.ShowProduct();
	}

}
