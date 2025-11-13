package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ProdName=request.getParameter("ProdName");
		String Category=request.getParameter("Category");
		int Quantity=Integer.parseInt( request.getParameter("Quantity"));
		int Price=Integer.parseInt(request.getParameter("Price"));
		Product p = new Product(ProdName, Category, Quantity, Price);
		ProductDao pd= new ProductDaoImpl();
			pd.addProduct(p);
		PrintWriter out= response.getWriter();
		out.println("<h2> Product Added... "+p+"</h2>");
			
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
