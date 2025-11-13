package com.demo.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao {
	Session s;
	
	public ProductDaoImpl(){
		Configuration cfg = new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		s=sf.openSession();
	}
	
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Transaction t= s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
				
	}
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stubTransaction t= s.beginTransaction();
		Transaction t= s.beginTransaction();
		Query query =s.createQuery("from Product order by ProdID");
		List<Product> list=query.list();
		System.out.println(list);
				return list;
	}
	public void deleteProduct(Product ProdId) {
		// TODO Auto-generated method stub
	
		Transaction t=s.beginTransaction();
		Product p1=(Product)s.get(Product.class, ProdId.getProdID());
		
		if(p1!=null){
			System.out.println(p1);
			
			s.delete(p1);
			System.out.println("Record is Deleted....");
		}
		t.commit();
		s.close();
		
		System.out.println("All done check DB..");
		
	}
	@Override
	public Product searchById(Product P) {
		Transaction t=s.beginTransaction();
		Product pd=(Product)s.get(Product.class, P.getProdID());
		t.commit();
		return pd;
	}
	
		
	
	
	@Override
	public void updateProduct(Product P) {
		// TODO Auto-generated method stub
		Transaction t=s.beginTransaction();
		System.out.println("impl "+P);
		Product pd=(Product)s.get(Product.class, P.getProdID());
	
			System.out.println(pd);
			pd.setProdName(P.getProdName());
			pd.setCategory(P.getCategory());
			pd.setQuantity(P.getQuantity());
			pd.setPrice(P.getPrice());
			
			s.update(pd);
			
			System.out.println("Record is Updated....");
		
		t.commit();
	
		
		System.out.println("All done check DB..");
	}

	
	
	
}
	

