<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

.createCustomer {
	margin-left: 450px;
	padding: 30px;
	width: 60%;
	border: 1px darkgrey solid; border-radius: 10px; width: 45	%; margin: 0 auto;

	
}
body {
	height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;

}

</style>
<body>

	<%@ include file="../layout/sidebarAdmin.jsp"%>

	<div class="createCustomer">
	
	          <h3 class="text-center"> Add New Product</h3>

		<form:form action="/QLCustomer/create" modelAttribute="customer">

			<div class="form-group">
				<form:label path="name" class="form-label">Name</form:label>
				<form:input path="name" class="form-control" />
				<form:errors path="name" cssStyle="color: red" />
			</div>
			<div class="form-group">
				<form:label path="email" class="form-label">Email</form:label>
				<form:input path="email" class="form-control" />
				<form:errors path="email" cssStyle="color: red" />
			</div>
			<div class="form-group">
				<form:label path="phone" class="form-label">Phone</form:label>
				<form:input path="phone" class="form-control" />
				<form:errors path="phone" cssStyle="color: red" />
			</div>
			<div class="form-group">
				<form:label path="password" class="form-label">Password</form:label>
				<form:input path="password" type="password" class="form-control" />
				<form:errors path="password" cssStyle="color: red" />
			</div>
			<!-- Modal footer -->
			<div class="modal-footer">
				<button type="submit" formaction="/QLCustomer/create"
					class="btn btn-primary">Create</button>
				<button type="button" class="btn btn-dark" >Close</button>
			</div>
		</form:form>
	</div>
</body>
</html>