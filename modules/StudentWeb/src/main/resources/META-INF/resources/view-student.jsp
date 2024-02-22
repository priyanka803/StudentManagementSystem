<%@include file="init.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<aui:form action="#" name="student" >
<aui:input name="firstName" label="First Name" type="text" id="firstName"></aui:input>
<aui:button type="button"  value="fetch-student" name="fetch-student" cssClass="btn btn-primary">
</aui:button>
</aui:form>
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
			<td id="first-name"></td>
			<td id="last-name"></td>
			<td id="course"></td>
			<td id="email"></td>

		</tr>
	</tbody>
</table>

<aui:script>


$("#<portlet:namespace/>fetch-student").on('click',function(){
   var studentFirstName = $("#<portlet:namespace/>firstName").val();

Liferay.Service(
'/student.student/find-student-by-first-name',
{
    firstName: studentFirstName
},
function(obj) {
     var jsonObject = JSON.stringify(obj);
     
     var parseData = JSON.parse(jsonObject);
     
     $("#first-name").html(parseData.firstName);
     $("#last-name").html(parseData.lastName);
     $("#course").html(parseData.course);
     $("#email").html(parseData.email);
     
}
);
})
</aui:script>