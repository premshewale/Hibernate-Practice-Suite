<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>AddBook.jsp</h3>
<h2>Add Book Details</h2>

<form action="AddData">
Book name:<select name="name" id="name">
<option value="Java">java</option>
<option value="Python">puthon</option>
<option value="ruby">ruby</option>
<option value="Cpp">cpp</option>
<option value="c">c</option>
</select>
Book category:<input type="text" name="category"><br><br>
Book Edition:<input type="text" name="edition"><br><br>
Book price:<input type="text" name="price"><br><br>
<input type="submit" value="Add Book">
<input type="reset">
</form>


</body>
</html>