<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet" href="../css/style.css">
</head>
<style>
.btn-primary:hover {
	background-color: #0056b3;
}

.card-footer {
	background-color: #f8f9fa;
	border-bottom-left-radius: 15px;
	border-bottom-right-radius: 15px;
}

.card-footer a:hover {
	text-decoration: underline;
}

.container {
	border-radius: 10px;
}

.card {
	background-color: #EEEEEE;
}
</style>

<body>
	<%@ include file="../layout/header.jsp" %>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header text-center">
						<h3>Đăng Ký</h3>
					</div>
					<div class="card-body">
						<form>
							<div class="mb-3">
								<label for="fullName" class="form-label">Name</label> <input
									type="text" class="form-control" id="fullName" required>
							</div>
							<div class="mb-3">
								<label for="email" class="form-label">Email</label> <input
									type="email" class="form-control" id="email" required>
							</div>
							<div class="mb-3">
								<label for="email" class="form-label">Phone</label> <input
									type="email" class="form-control" id="email" required>
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" id="password" required>
							</div>
							<div class="mb-3">
								<label for="confirmPassword" class="form-label">Confirm
									Password</label> <input type="password" class="form-control"
									id="confirmPassword" required>
							</div>
							<button type="submit" class="btn btn-primary w-100">Đăng
								Ký</button>
						</form>
					</div>
					<div class="card-footer text-center">
						<a href="#">Đã có tài khoản? Đăng nhập</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="../layout/footer.jsp" %>

	<!-- Bootstrap JS and dependencies -->
	  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.0/js/bootstrap.min.js"></script>


</body>
</html>