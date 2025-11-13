<%@page import="java.util.List"%>
<%@page import="com.demo.bean.Product"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>ShowProduct.jsp</h2>
<% List<Product> prodlist=(List<Product>)request.getAttribute("prodlist"); %>
<table background="lightpink" border="4px">
<tr bgcolor="orange"><th>PRODUCTID</th>
	<th>PRODUCTNAME</th>
	<th>CATEGORY </th>
	<th> QUANTITY</th>
	<th>PRICE</th>
	<th>ACTIONS</th></tr>
	<%for(Product p:prodlist) {%>
<tr>
	<td><%=p.getProdID() %></td>
	<td><%=p.getProdName() %></td>
	<td><%=p.getCategory() %></td>
	<td><%=p.getQuantity() %></td>
	<td><%=p.getPrice() %></td>
	<td><a href="DeleteProductServlet?productId=<%=p.getProdID()%>">Delete</a>
	<a href="EditProductServlet?productId=<%=p.getProdID()%>">Edit</a></td>
</tr>
	<% } %>
</table>

</body>
</html>