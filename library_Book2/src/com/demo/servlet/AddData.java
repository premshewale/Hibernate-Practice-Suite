package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Book1;

import com.demo.dao.DaoClass;
import com.demo.dao.DaoImplementation;


/**
 * Servlet implementation class AddData
 */
public class AddData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddData() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Adds");
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		String edition=request.getParameter("edition");
		int price=Integer.parseInt(request.getParameter("price"));
		
		
		Book1 b=new Book1(name, category, edition, price);
		DaoClass pd=new DaoImplementation();
		pd.addBook(b);
		System.out.println(b);
		PrintWriter out=response.getWriter();
		out.println("<h2>Book Added..."+b+"</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
