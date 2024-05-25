
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>

<style>
label {
	font-size: 20px;
	font-weight: 600;
}
</style>
<body
		style="height: 70vh; display: flex; align-items: center; justify-content: center; background-color: #F8F4E1">
	<div class="col-3">
		<h2>Form dang ky sinh vien</h2>
		<div>

			<fm:form modelAttribute="sv" action="save" method="post">
				<div>
					<label>Name: </label>
					<fm:input path="name" class="form-control" />
				</div>
				<div>
					<label class="mt-3">Email: </label>
					<fm:input path="email" class="form-control" />
				</div>
				<div>
					<label class="mt-3">Marks: </label>
					<fm:input path="marks" class="form-control" />
				</div>
				<div>
					<label class="mt-3 ">Gender: </label>
					<fm:radiobutton path="gender" value="true" label="Male" />
					<fm:radiobutton path="gender" value="false" label="female" />
				</div>

				<div>
					<label>Hobbies: </label>
					<fm:checkboxes items="${hobbies}" path="faculties"
						class="mt-3 ms-2" />
				</div>

				<div>
					<label class="mt-3">faculties: </label>
					<fm:select path="hobbies" class="form-control">
						<fm:options items="${faculties}" />
					</fm:select>
				</div>

				<div class="text-danger">
				<div>${message}</div>
				<c:forEach var="error" items="${errors}">
                    ${error.defaultMessage}<br />
					</c:forEach>
				</div>
				<div>
					<button class="btn btn-primary mt-3">Save</button>
				</div>

			</fm:form>

		</div>
	</div>
</body>
</html>