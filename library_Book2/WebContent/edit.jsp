<%@page import="com.demo.bean.Book1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Book1 pd=(Book1)request.getAttribute("Book1");
%>
<form action="EditData" method="get">
Book ID:<input type="text" name="id" readonly="readonly"
value=<%=pd.getBookid() %>><br><br>
Book name:<select name="name" id="name" value=<%=pd.getName() %>>
<option value="Java">java</option>
<option value="Python">puthon</option>
<option value="ruby">ruby</option>
<option value="Cpp">cpp</option>
<option value="c">c</option>
</select>

Book Category:<input type="text" name="category" value=<%=pd.getCategory() %>><br><br>
Book Edition:<input type="text" name="edition" value=<%=pd.getEdition() %>><br><br>
Book Price:<input type="text" name="price" value=<%=pd.getPrice() %>><br><br>
<input type="submit" value="Edit Book Details">



</form>
</body>
</html>