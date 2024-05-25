
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

.err {
	color: red;
}
.pass{
   color: #A1DD70;
}
</style>
<body
	style="height: 70vh; display: flex; align-items: center; justify-content: center; background-color: #F8F4E1">
	<div class="col-3">
		<h2 class="pass">${message}</h2>

		<h2>Form Dang Ky Sinh Viên</h2>
		<div>

			<fm:form modelAttribute="sv" action="save" method="post">
				<div>
					<label>Name: </label>
					<fm:input path="name" class="form-control" />
					<fm:errors path="name" sssClass="error" class="err"></fm:errors>

				</div>
				<div>
					<label class="mt-3">Email: </label>
					<fm:input path="email" class="form-control" />
					<fm:errors path="email" sssClass="error" class="err"></fm:errors>

				</div>
				<div>
					<label class="mt-3">Marks: </label>
					<fm:input path="marks" class="form-control" />
					<fm:errors path="marks" sssClass="error" class="err"></fm:errors>
				</div>
				<div>
					<label class="mt-3 ">Gender: </label>
					<fm:radiobutton path="gender" value="true" label="Male" />
					<fm:radiobutton path="gender" value="false" label="female" />
					<br>
					<fm:errors path="gender" sssClass="error" class="err"></fm:errors>
				</div>

				<div>
					<label class="mt-3">faculty: </label>
					<fm:select path="faculty" class="form-control">
						<fm:option value="CNTT">Công nghệ thông tin</fm:option>
						<fm:option value="QTKD">Quản trị kinh doanh</fm:option>
						<fm:option value="KT">Kinh Tế</fm:option>
					

					</fm:select>
				</div>

				<div>
					<button class="btn btn-primary mt-3">Save</button>
				</div>

			</fm:form>

		</div>
	</div>
</body>
</html>