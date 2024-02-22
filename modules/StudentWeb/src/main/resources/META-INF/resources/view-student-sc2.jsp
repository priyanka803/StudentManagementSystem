<%@page import="com.sdn.student.web.service.StudentLocalServiceUtil"%>
<%@include file="init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="java.util.*"%>
<%@page import="com.sdn.student.web.model.Student"%>

<%
   List<Student> students = (List<Student>) request.getAttribute("students");
%>

<liferay-ui:search-container  delta="4" deltaConfigurable="true" total="<%= students.size() %>">
<liferay-ui:search-container-results results="<%=students %>">

</liferay-ui:search-container-results>

<liferay-ui:search-container-row className="com.sdn.student.web.model.Student" 
keyProperty="studentId"
modelVar="currentStudent"> 
             
<liferay-ui:search-container-column-text  name="FirstName"  value="<%= currentStudent.getFirstName() %>"/>
<liferay-ui:search-container-column-text  name="LastName" value="<%= currentStudent.getLastName() %>" />
<liferay-ui:search-container-column-text  name="Course" value="<%= currentStudent.getCourse() %>"/>     
<liferay-ui:search-container-column-text  name="Email" value="<%= currentStudent.getEmail() %>"/>     

</liferay-ui:search-container-row>
<liferay-ui:search-iterator />
</liferay-ui:search-container>