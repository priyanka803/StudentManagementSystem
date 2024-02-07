  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.sdn.student.web.model.Student"%>
  <%@ include file="init.jsp" %>


<%
Student student=(Student)request.getAttribute("student");
%>
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">First Name</th>
			<th scope="col">Last Name</th>
			<th scope="col">Course</th>
			<th scope="col">Email</th>
			
		</tr>
	</thead>
	<tbody>
			<tr>
				<td>${student.getFirstName()}</td>
				<td>${studdent.getLastName()}</td>
				<td>${student.getCourse()}</td>
				<td>${student.getEmail()}</td>
				
			</tr>
	</tbody>
</table>
