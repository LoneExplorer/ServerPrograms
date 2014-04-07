<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="edu.nyt.cst3619.dao.ss8285.XMLStudentDAO" %>
<%@ page import="edu.nyt.cst3619.facade.homework.IStudentDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.nyt.cst3619.model.homework.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		IStudentDAO dao = new XMLStudentDAO();
		int rowCount = dao.findAllFemale().size();
		
%> 

<h1>The number of Female Students <%= rowCount %></h1>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>ID</th>
<th>Scores</th>
</tr>
<%
List<Student> s = dao.findAllFemale();

for (Student student : s){
%>
<tr>
<td><%=student.getFirstName() %></td>
<td><%=student.getLastName() %></td>
<td><%= student.getId() %></td>
<td><%= student.getScores() %></td>
</tr>
<%
}

 %>
 </table>
</body>
</html>