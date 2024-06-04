<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<div class="card">
			<div class="card-header">
				<h3>Product List</h3>
			</div>
			<div class="card-body">
				<table class="table table-striped table-bordered">
					<thead class="thead-dark">
						<tr>
							<th  ><a href="/product/sort?field=id"  >Id</a></th>
							<th><a href="/product/sort?field=name">Name</a></th>
							<th><a href="/product/sort?field=price">Price</a></th>
							<th><a href="/product/sort?field=createDate">Date</a></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${itemSort}">
							<tr>
								<td>${item.id}</td>
								<td>${item.name}</td>
								<td>${item.price}</td>
								<td>${item.createDate}</td>


							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>


</body>
</html>
