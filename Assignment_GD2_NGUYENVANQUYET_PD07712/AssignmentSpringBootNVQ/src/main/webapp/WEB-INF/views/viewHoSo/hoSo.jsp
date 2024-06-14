<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<style>
body {
	background-color: #f8f9fa;
}

.card {
	margin-bottom: 20px;
	border: none;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	transition: box-shadow 0.3s ease-in-out;
}

.card:hover {
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
}

.card-img-top {
	border-radius: 50%;
	width: 150px;
	height: 150px;
	object-fit: cover;
	margin: 20px auto 0;
}

.btn-primary {
	background-color: #007bff;
	border-color: #007bff;
}

.btn-primary:hover {
	background-color: #0056b3;
	border-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<img src="https://via.placeholder.com/150" class="card-img-top"
						alt="User Image">
					<div class="card-body text-center">
						<h5 class="card-title">John Doe</h5>
						<p class="card-text">Web Developer</p>
						<a href="#" class="btn btn-primary btn-sm">Follow</a>
					</div>
				</div>
			</div>
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">
						<h5>About</h5>
					</div>
					<div class="card-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Suspendisse varius enim in eros elementum tristique.</p>
					</div>
				</div>
				<div class="card mt-3">
					<div class="card-header">
						<h5>Contact Information</h5>
					</div>
					<div class="card-body">
						<ul class="list-unstyled">
							<li><strong>Email:</strong> john.doe@example.com</li>
							<li><strong>Phone:</strong> (123) 456-7890</li>
							<li><strong>Address:</strong> 123 Main St, Anytown, USA</li>
							<li><strong>Create Date:</strong> January 1, 2023</li>
						</ul>
						<button id="editProfileBtn" class="btn btn-primary btn-sm">Update</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap JS and dependencies -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<!-- Custom JavaScript -->
	<script src="script.js"></script>
</body>
</html>