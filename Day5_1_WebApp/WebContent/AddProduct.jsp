<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>AddProduct.jsp</h3>
<fieldset >
<h2>Add Product Details</h2>

<form action="AddData">
<table bgcolor="lightgrey">
<tr>
<td>Product Name:</td> <td><input type="text" name="ProdName"></td></tr>
<tr><td>Product Category:</td><td> <input type="text" name="Category"></td></tr>
<tr><td>Product Quentity:</td><td> <input type="text" name="Quantity"></td></tr>
<tr><td>Product Price:</td><td> <input type="text" name="Price"></td></tr>
<tr><td><input type="submit" value="Add Product"></td></tr>
<tr><td><input type="Reset"></td></tr>
</table>
</form>


</fieldset>
<h4><a href="index.jsp">Go to Index Page..</a></h4>
</body>
</html>