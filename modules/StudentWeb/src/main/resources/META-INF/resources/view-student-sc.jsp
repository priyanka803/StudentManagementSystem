<%@page import="com.sdn.student.web.service.StudentLocalServiceUtil"%>
<%@include file="init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<style>
.container-row{

}
</style>

<liferay-ui:search-container  delta="4" deltaConfigurable="true" total="<%=StudentLocalServiceUtil.getStudentsCount()%>" >
<liferay-ui:search-container-results results="<%= StudentLocalServiceUtil.getStudents(searchContainer.getStart(), searchContainer.getEnd()) %>">

</liferay-ui:search-container-results>

<liferay-ui:search-container-row cssClass="container-row" className="com.sdn.student.web.model.Student" 
keyProperty="studentId"
modelVar="currentStudent"> 
             
<liferay-ui:search-container-column-text cssClass="container-column" name="FirstName"  property="firstName"/>
<liferay-ui:search-container-column-text cssClass="container-column" name="LastName" property="lastName"  />
<liferay-ui:search-container-column-text cssClass="container-column" name="Course" property="course"/>     
<liferay-ui:search-container-column-text cssClass="container-column" name="Email" property="email"/>     

</liferay-ui:search-container-row>
<liferay-ui:search-iterator />
</liferay-ui:search-container>