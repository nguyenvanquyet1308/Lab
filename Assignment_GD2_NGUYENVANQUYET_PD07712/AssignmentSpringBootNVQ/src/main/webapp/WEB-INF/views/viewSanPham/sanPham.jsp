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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<link rel="stylesheet" href="../css/sanpham.css">

</head>
<body>

	<%@ include file="../layout/header.jsp"%>
	<div class="container">
		<div class="row">
			<!-- Sidebar for filters -->
			<div class="col-md-3 filter-section">
				<h3>Filter Products</h3>
				<!-- Filter by Name -->
				<div class="form-group">
					<label for="filterName">Name</label> <input type="text"
						class="form-control" id="filterName" placeholder="Search by name">
				</div>
				<!-- Filter by Size -->
				<div class="form-group">
					<label for="filterSize">Size</label> <select class="form-control"
						id="filterSize">
						<option value="">All Sizes</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
					</select>
				</div>
				<!-- Filter by Price -->
				<div class="form-group">
					<label for="filterPrice">Price</label> <input type="range"
						class="form-control-range" id="filterPrice" min="0" max="300"
						step="10">
					<div class="d-flex justify-content-between">
						<span>$0</span> <span>$300</span>
					</div>
				</div>
				<!-- Filter by Color -->
				<div class="form-group">
					<label for="filterColor">Color</label> <select class="form-control"
						id="filterColor">
						<option value="">All Colors</option>
						<option value="black">Black</option>
						<option value="white">White</option>
						<option value="red">Red</option>
						<option value="blue">Blue</option>
						<option value="green">Green</option>
					</select>
				</div>
				<!-- Filter by Brand -->
				<div class="form-group">
					<label for="filterBrand">Brand</label> <select class="form-control"
						id="filterBrand">
						<option value="">All Brands</option>
						<option value="nike">Nike</option>
						<option value="adidas">Adidas</option>
						<option value="puma">Puma</option>
						<option value="reebok">Reebok</option>
						<option value="new_balance">New Balance</option>
					</select>
				</div>
				<!-- Filter by Type -->
				<div class="form-group">
					<label>Type</label>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="typeRunning"> <label class="form-check-label"
							for="typeRunning"> Running Shoes </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="typeCasual"> <label class="form-check-label"
							for="typeCasual"> Casual Shoes </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="typeSports"> <label class="form-check-label"
							for="typeSports"> Sports Shoes </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="typeFormal"> <label class="form-check-label"
							for="typeFormal"> Formal Shoes </label>
					</div>
				</div>
				<button class="btn btn-primary btn-block">Apply Filters</button>
			</div>
			<!-- Main content for products -->
			<div class="col-md-9">
				<form:form>
					<div class="row">
						<c:forEach var="item" items="${page.content}">
							<div class="col-md-4 mb-4">
								<div class="card">
									<img src="/getimgae/${item.image}" class="card-img-top"
										alt="${item.name}">
									<div class="card-body ">
										<h5 class="card-title text-center ">${item.name}</h5>
										<p class="card-text text-center">${item.unitPrice}</p>
										<a href="" class="btn"><i
											class="fa-solid fa-cart-shopping"></i></a> <a
											href="/trangchu/thanhtoan" class="btn btn-danger "
											style="font-size: 12px;"> <i
											class="fa-brands fa-cc-amazon-pay"></i> Thanh toán ngay

										</a>
									</div>
								</div>
							</div>
						</c:forEach>
						<nav aria-label="Page navigation" style="margin-left: 260px;" >
							<ul class="pagination" >
								<li class="page-item"><a class="page-link"
									href="/trangchu/sanpham?p=0">First</a></li>
								<li class="page-item"><a class="page-link"
									href="/trangchu/sanpham?p=${page.number-1}">Previous</a></li>
								<c:forEach var="i" begin="0" end="${page.totalPages-1}">
									<li
										class="page-item <c:if test="${i eq page.number}">active</c:if>">
										<a class="page-link" href="/trangchu/sanpham?p=${i}">${i+1}</a>
									</li>
								</c:forEach>
								<li class="page-item"><a class="page-link"
									href="/trangchu/sanpham?p=${page.number+1}">Next</a></li>
								<li class="page-item"><a class="page-link"
									href="/trangchu/sanpham?p=${page.totalPages-1}">Last</a></li>
							</ul>
						</nav>
					</div>

				</form:form>
			</div>

		</div>
	</div>


	<%@ include file="../layout/footer.jsp"%>
	<!-- Bootstrap JS and dependencies -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha384-KyZXEAg3QhqLMpG8r+Knujsl5/0Wg0zP5rK/IDz0f0d23nPrKgNE9xj5lbF5BphZ"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
		
      
    

	<script src="https://kit.fontawesome.com/bff65d775c.js"
		crossorigin="anonymous"></script>
</body>
</html>