<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %>
        <%@page import="com.demo.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>display.jsp</h2>
<%

List<Book1> booklist=(List<Book1>)request.getAttribute("prodlist");
%>
<table border="3">
	<tr><th>BookId</th>
	<th>Book name</th>
	<th>Category</th>
	<th>Edition</th>
	<th>Price</th>
	
	<th>Action</th>
	
</tr>
	<%
	for(Book1 p:booklist){
	%>
	<tr>
	<td><%=p.getBookid() %></td>
	<td><%=p.getName() %></td>
	<td><%=p.getCategory() %></td>
	<td><%=p.getEdition()%></td>
	<td><%=p.getPrice() %></td>
	
	<td>
	<a href="DeleteData?bookid=<%=p.getBookid() %>">Delete</a>
	<a href="EditDervlet?bookid=<%=p.getBookid() %>">Edit</a>
	</td>
	</tr>
	<%} %>
</table>
</body>
</html>