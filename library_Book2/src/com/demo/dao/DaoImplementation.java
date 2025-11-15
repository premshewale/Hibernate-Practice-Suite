package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Book1;
import com.demo.bean.Student;




public class DaoImplementation implements DaoClass {
	Session s;
	public DaoImplementation()
	{
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		s=sf.openSession();
	}
	@Override
	public void addBook(Book1 b) {
		Transaction t=s.beginTransaction();
		s.save(b);
		t.commit();
		s.close();
		
	}

	@Override
	public List<Book1> getAllBook() {
		Transaction t=s.beginTransaction();
		System.out.println("getallbook");
		Query q=s.createQuery("from Book1");
		List<Book1> list =q.list();
		System.out.println(list);
		return list;
		
		
	}

	@Override
	public void deleteBook(Book1 Bookid) {
		Transaction t=s.beginTransaction();
		Book1 p1=(Book1)s.get(Book1.class, Bookid.getBookid());
		if(p1!=null) {
			System.out.println(p1);
			s.delete(p1);
			System.out.println("record deleted....");
		}
		t.commit();
		s.close();
		System.out.println("All done check db...");
		
	}

	@Override
	public void updateBook(Book1 b) {

		Transaction t=s.beginTransaction();
		Book1 pd=(Book1)s.get(Book1.class, b.getBookid());
		pd.setCategory(b.getCategory());
		pd.setName(b.getName());
		pd.setPrice(b.getPrice());
		pd.setEdition(b.getEdition());
		
				
		s.update(pd);
		t.commit();
		
	}

	@Override
	public Book1 searchById(Book1 b) {
	
		Transaction t=s.beginTransaction();
		 Book1 pd=(Book1)s.get(Book1.class, b.getBookid());
		t.commit();
		return pd;
	}
	@Override
	public void addStudent(Student st) {
		System.out.println("addStudents");
		Transaction t=s.beginTransaction();
		s.save(st);
		t.commit();
		s.close();
		
	}
	@Override
	public List<Student> getAllStudents() {
System.out.println("get all students");
		Transaction t=s.beginTransaction();
		System.out.println("get all students");
		Query q=s.createQuery("from Student");
		System.out.println(q);
		List<Student> list =q.list();
		System.out.println(list);
		return list;
		
	}
	@Override
	public Student searchById(Student st) {
		Transaction t=s.beginTransaction();
		 Student stu=(Student)s.get(Student.class, st.getId());
		t.commit();
		return stu;
	}

}
