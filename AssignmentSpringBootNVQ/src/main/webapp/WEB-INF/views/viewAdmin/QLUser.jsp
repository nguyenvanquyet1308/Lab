<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
.user {
	margin-left: 200px;
	padding: 30px;
	width: 70%;

}
</style>
<body>
	<%@ include file="../layout/sidebarAdmin.jsp"%>

	<div class="user mt-5">
		<div class="text-start ">
			<button class="btn btn-success" data-bs-toggle="modal"
				data-bs-target="#myModal">Create New User</button>
		</div>
		<h2 class="text-center">User Management</h2>
		<table class="table table-bordered">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Email</th>
					<th>Name</th>
					<th>Password</th>
					<th>Phone</th>
					<th>Registered_date</th>
					<th>Status</th>
					<th>Vai</th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>John Doe</td>
					<td>john.doe@example.com</td>
					<td>john.doe@example.com</td>
					<td>john.doe@example.com</td>
					<td>john.doe@example.com</td>
					<td>john.doe@example.com</td>
					<td>
						<button class="btn btn-primary btn-sm">Edit</button>
						<button class="btn btn-danger btn-sm">Delete</button>
					</td>
				</tr>

			</tbody>
		</table>

		<!-- The Modal -->
		<div class="modal" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Add New User</h4>
						<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">
						<form>

							<div class="form-group">
								<label for="name">Name:</label> <input type="text"
									class="form-control" id="name">
							</div>
							<div class="form-group">
								<label for="email">Email:</label> <input type="email"
									class="form-control" id="email">
							</div>
							<div class="form-group">
								<label for="phone">Phone:</label> <input type="tel"
									class="form-control" id="phone">
							</div>
							<div class="form-group">
								<label for="password">Password:</label> <input type="password"
									class="form-control" id="password">
							</div>
						</form>
					</div>

					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-success"
							data-bs-dismiss="modal">Save</button>
						<button type="button" class="btn btn-danger"
							data-bs-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>
	</div>




</body>
