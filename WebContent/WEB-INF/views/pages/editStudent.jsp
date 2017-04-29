<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="POST" action="${pageContext.request.contextPath}/editStudent/${student.id }" modelAttribute="student">
	<div class="form-group">
		<form:label path="name" >Name</form:label>
		<form:input path="name" class="form-control" placeholder="name" />
	</div>
	<div class="form-group">
		<form:label path="gpax" >GPAX</form:label>
		<form:input path="gpax" class="form-control" placeholder="gpax" />
	</div>
	<div class="form-group">
		<form:label path="ambition" >Ambition</form:label>
		<form:input path="ambition" class="form-control" placeholder="ambition"/>
	</div>
	<button type="submit" class="btn btn-default">Save</button>
</form:form>