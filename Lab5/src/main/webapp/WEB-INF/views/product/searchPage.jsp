<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<form action="/product/searchPage" method="post">
		<input name="keywords" value="${keywords}">
		<button>Search</button>
	</form>
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
					<c:forEach var="item" items="${searchPage.content}">
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
		<a href="/product/searchPage?p=0" class="btn btn-primary" > First</a> <a
			href="/product/searchPage?p=${searchPage.number-1}" class="btn btn-primary" >Previous</a> <a
			href="/product/searchPage?p=${searchPage.number+1}" class="btn btn-primary">Next</a> <a
			href="/product/searchPage?p=${searchPage.totalPages-1}" class="btn btn-primary">Last</a>
		<ul>
			<li>Số thực thể hiện tại: ${searchPage.numberOfElements}</li>
			<li>Trang số: ${searchPage.number}</li>
			<li>Kích thước trang: ${searchPage.size}</li>
			<li>Tổng số thực thể: ${searchPage.totalElements}</li>
			<li>Tổng số trang: ${searchPage.totalPages}</li>
		</ul>
</body>
</html>