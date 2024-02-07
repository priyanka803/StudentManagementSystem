<%@include file="init.jsp"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.sdn.student.web.model.Student"%>
<%@page import="com.sdn.student.web.constants.MVCCommandNameConstants"%>


<%
   List<Student> students = (List<Student>) request.getAttribute("students");
%>



<portlet:renderURL var="studentAddRenderURL">
	<portlet:param name="mvcPath" value="/addStudent.jsp" />
</portlet:renderURL>

<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">First Name</th>
			<th scope="col">Last Name</th>
			<th scope="col">Course</th>
			<th scope="col">Email</th>
			<th scope="col">Update</th>
			<th scope="col">Delete</th>
			<th scope="col">Find Student By Name</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${students}" var="student">

			<portlet:actionURL name="<%= MVCCommandNameConstants.DELETE_STUDENT %>" var="studentDeleteActionURL">
				<portlet:param name="studentId" value="${student.getStudentId()}" />
			</portlet:actionURL>

			<portlet:renderURL var="studentUpdateRenderURL">
				<portlet:param name="studentId" value="${student.getStudentId()}" />
				<portlet:param name="mvcRenderCommandName" value="<%= MVCCommandNameConstants.UPDATE_STUDENT_RENDER_URL %>"/>
				
				<%--  <portlet:param name="firstName" value="${student.getFirstName()}" />
				<portlet:param name="lastName" value="${student.getLastName()}" />
				<portlet:param name="course" value="${student.getCourse()}" />
				<portlet:param name="email" value="${student.getEmail()}" />
				<portlet:param name="mvcPath" value="/updateStudent.jsp" />
				--%>
				
			</portlet:renderURL>
			
			<portlet:renderURL var="viewStudentRenderURL">
			<portlet:param name="mvcRenderCommandName" value="<%= MVCCommandNameConstants.VIEW_STUDENT_BY_NAME_URL %>"/>
				<portlet:param name="firstName" value="${student.getFirstName()}"/>	
				</portlet:renderURL>
			<tr>
				<td>${student.getFirstName()}</td>
				<td>${studdent.getLastName()}</td>
				<td>${student.getCourse()}</td>
				<td>${student.getEmail()}</td>
				<td><a href="<%=studentUpdateRenderURL%>"
					class="badge badge-primary">Update Student</a></td>
				<td><a href="<%=studentDeleteActionURL%>" onclick="deleteStudent('${student.getStudentId()}')"
					class="badge badge-primary">Delete Student</a></td>
			    
			    <td><a href="<%=viewStudentRenderURL%>"
					class="badge badge-primary">View</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<portlet:renderURL var="remoteApiRenderURL">
	<portlet:param name="mvcPath" value="/view-student.jsp" />
</portlet:renderURL>

<a href="<%=studentAddRenderURL%>" class="badge badge-primary" onclick="showPopup()">Add
	Student</a>
	
	<a href="<%=remoteApiRenderURL%>" class="badge badge-primary">View Student</a>

	