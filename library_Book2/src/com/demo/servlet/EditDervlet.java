package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Book1;

import com.demo.dao.DaoClass;
import com.demo.dao.DaoImplementation;


/**
 * Servlet implementation class EditDervlet
 */
public class EditDervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDervlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("bookid"));
		Book1 pd=new Book1();
		pd.setBookid(id);
		DaoClass pdao=new DaoImplementation();
		Book1 pd1=pdao.searchById(pd);
		if(pd1!=null) {
			RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
			request.setAttribute("Book1", pd1);
			rd.forward(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
