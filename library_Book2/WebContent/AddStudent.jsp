<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student.jsp</h3>
<h2>Add Student Details</h2>

<form action="AddStudent">
Student Name:<input type="text" name="name"><br><br>
Student Email:<input type="text" name="email"><br><br>
Student Phone No:<input type="text" name="phoneno"><br><br>
Student Branch:<select name="branch" id="branch">
<option value="Computer Science">Computer Science</option>
<option value="Electronics">Electronics</option>
<option value="Civil">Civil</option>
<option value="Electrical">Electrical</option>

</select>
<br><br>
<input type="submit" value="Save">

<input type="reset">

</form>
</body>
</html>