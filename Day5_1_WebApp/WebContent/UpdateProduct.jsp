<%@page import="java.util.List"%>
<%@page import="com.demo.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>EditProduct.jsp</h3>
<fieldset >
<h2>Edit Product Details</h2>
<% Product p=(Product)request.getAttribute("product"); %>

<form action="EditData" method="get">

<table bgcolor="lightgrey">

<tr>
<td>Product ID:</td> <td><input type="text" value="<%=p.getProdID() %>" name="id" readonly="readonly"></td></tr>
<td>Product Name:</td> <td><input type="text" value="<%=p.getProdName() %>" name="name"></td></tr>
<tr><td>Product Category:</td><td> <input type="text" value="<%=p.getCategory() %>" name="cat"></td></tr>
<tr><td>Product Quantity:</td><td> <input type="text" value="<%=p.getQuantity()%>" name="qty"></td></tr>
<tr><td>Product Price:</td><td> <input type="text" value="<%=p.getPrice() %>" name="price"></td></tr>
<tr><td><input type="submit" value="Add Product"></td></tr>
<tr><td><input type="Reset"></td></tr>

</table>
</form>


</fieldset>
<h4><a href="index.jsp">Go to Index Page..</a></h4>

</body>
</html>