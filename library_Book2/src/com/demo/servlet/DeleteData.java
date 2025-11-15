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
 * Servlet implementation class DeleteData
 */
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteData() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ProdID=Integer.parseInt(request.getParameter("bookid"));
		Book1 p=new Book1(ProdID);
		DaoClass pd=new DaoImplementation();
		pd.deleteBook(p);
		PrintWriter out=response.getWriter();
		out.println("<h2>Book deleted..."+p+"</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
