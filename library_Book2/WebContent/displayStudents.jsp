<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %>
        <%@page import="com.demo.bean.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student List</title>
</head>
<body>
    <h2>Student List</h2>
     <%
        List<Student> studlist1 = (List<Student>) request.getAttribute("studlist");
       
        %>
    <table border="1">
        <tr>
           <!--  <th>Student ID</th> -->
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Branch</th>
            <th>Action</th>
        </tr>
        <%
        for(Student s:studlist1){
      
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getPhoneno() %></td>
            <td><%= s.getBranch() %></td>
            <td>
                <a href="DeleteData?id=<%= s.getId() %>">Delete</a>
                <a href="EditServlet?id=<%= s.getId() %>">Edit</a>
            </td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>