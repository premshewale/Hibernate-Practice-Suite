package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Book1;
import com.demo.bean.Student;
import com.demo.dao.DaoClass;
import com.demo.dao.DaoImplementation;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String branch=request.getParameter("branch");
		int phoneno=Integer.parseInt(request.getParameter("phoneno"));
		
		System.out.println(name+email+phoneno+branch);
		Student st=new Student(name,email,phoneno,branch);
		DaoClass d=new DaoImplementation();
		d.addStudent(st);
		System.out.println(st);
		PrintWriter out=response.getWriter();
		out.println("<h2>Student Added..."+st+"</h2>");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
