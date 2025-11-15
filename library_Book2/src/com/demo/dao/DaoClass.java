package com.demo.dao;

import java.util.List;

import com.demo.bean.Book1;
import com.demo.bean.Student;

public interface DaoClass {
	void addBook(Book1 b);
	List<Book1> getAllBook();
	void deleteBook(Book1 Bookid);
	void updateBook(Book1 b);
	Book1 searchById(Book1 b);
	
	
	void addStudent(Student st);
	List<Student> getAllStudents();
	Student searchById(Student st);
	
}
