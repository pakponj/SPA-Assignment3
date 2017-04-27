<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

${message}
<form:form method="POST" action="${pageContext.request.contextPath}/addNewStudent" modelAttribute="student">
	<div class="form-group">
		<form:label path="name" >Name</form:label>
		<form:input path="name" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="gpax" >GPAX</form:label>
		<form:input path="gpax" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="ambition" >Ambition</form:label>
		<form:input path="ambition" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-default">Save</button>
</form:form>