<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container mt-5">
		<div class="card">
			<div class="card-header">
				<h3 class="text-center">Product List</h3>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead class="thead-dark">
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Price</th>
								<th>Date</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${page.content}">
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
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<li class="page-item"><a class="page-link"
							href="/product/page?p=0">First</a></li>
						<li class="page-item"><a class="page-link"
							href="/product/page?p=${page.number-1}">Previous</a></li>
						<c:forEach var="i" begin="0" end="${page.totalPages-1}">
							<li
								class="page-item <c:if test="${i eq page.number}">active</c:if>">
								<a class="page-link" href="/product/page?p=${i}">${i+1}</a>
							</li>
						</c:forEach>
						<li class="page-item"><a class="page-link"
							href="/product/page?p=${page.number+1}">Next</a></li>
						<li class="page-item"><a class="page-link"
							href="/product/page?p=${page.totalPages-1}">Last</a></li>
					</ul>
				</nav>
				<ul class="">
					<li>Số thực thể hiện tại: ${page.numberOfElements}</li>
					<li>Trang số: ${page.number}</li>
					<li>Kích thước trang: ${page.size}</li>
					<li>Tổng số thực thể: ${page.totalElements}</li>
					<li>Tổng số trang: ${page.totalPages}</li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
