<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">

<body>

	<div id="wrapper">
		<%@ include file="../layout/header.jsp" %>
		<div id="banner">
			<div class="box-left">
				<h2>
					<span>SẢN PHẨM HOT</span> <br> <span>NEW READ</span>
				</h2>
				<p>Xu hướng những sản phẩm giày hot nhất hiện nay đang chờ đón
					bạn tại cửa hành</p>
				<button>Mua ngay</button>
			</div>
			<div class="box-right">
				<img src="image/3soc.jpg" alt=""> <img src="image/3soc1.jpg"
					alt=""> <img src="image/gucci.jpg" alt="">
			</div>
			<div class="to-bottom">
				<a href=""> <img src="assets/to_bottom.png" alt="">
				</a>
			</div>
		</div>

		<div class="row row-cols-1 row-cols-md-3 g-5 py-5">
			<c:forEach var="item" items="${itemProduct}">
				<div class="col">
					<div class="card">
						<img src="image/gucci1.jpg" " class="card-img-top" alt="...">

						<div class="card-body">
							<h5 class="card-title">${item.name}</h5>
							<p class="card-text">${item.description}</p>
						</div>
						<div class="mb-5 d-flex justify-content-around">
							<h3>${item.unitPrice}</h3>
							<div class="icon-cart">
								<img src="assets/iconcart.jpg" data-bs-toggle="modal"
									data-bs-target="#myModal" alt="" height="60px" width="60px">
							</div>
						</div>
					</div>

				</div>
			</c:forEach>
			<div class="modal" id="myModal">
				<div class="modal-dialog modal-lg modal-dialog-scrollable">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Tên giày</h4>
							<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<div class="row">
								<div class="col-md-6">
									<img src="path_to_shoe_image.jpg" class="img-fluid"
										alt="Hình ảnh giày">
								</div>
								<div class="col-md-6">
									<h5>Size:</h5>
									<select class="form-select mb-3">
										<option selected>Chọn size</option>
										<option value="1">Size 1</option>
										<option value="2">Size 2</option>
										<option value="3">Size 3</option>
									</select>
									<h5>Số lượng:</h5>
									<input type="number" class="form-control mb-3" value="1">
									<h5>Giá bán:</h5>
									<p>$100</p>
								</div>
							</div>
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-primary">Thêm vào
								giỏ hàng</button>
							<button type="button" class="btn btn-success">Thanh toán</button>
						</div>

					</div>
				</div>
			</div>

		</div>

		<div id="saleoff">
			<div class="box-left">
				<h1>
					<span>GIẢM GIÁ LÊN ĐẾN</span> <span>45%</span>
				</h1>
			</div>
			<div class="box-right"></div>
		</div>

		<div id="comment">
			<h2>NHẬN XÉT CỦA KHÁCH HÀNG</h2>
			<div id="comment-body">
				<div class="prev">
					<a href="#"> <img src="assets/prev.png" alt="">
					</a>
				</div>
				<ul id="list-comment">
					<li class="item">
						<div class="avatar">
							<img src="assets/avatar_1.png" alt="">

						</div>
						<div class="stars">
							<span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span>
						</div>
						<div class="name">Nguyễn Đình Vũ</div>

						<div class="text">
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s, when an unknown
								printer took a galley of type and scrambled it to make a type
								specimen book.</p>
						</div>
					</li>
					<li class="item">
						<div class="avatar">
							<img src="assets/avatar_1.png" alt="">

						</div>
						<div class="stars">
							<span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span>
						</div>
						<div class="name">Trần Ngọc Sơn</div>

						<div class="text">
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s, when an unknown
								printer took a galley of type and scrambled it to make a type
								specimen book.</p>
						</div>
					</li>
					<li class="item">
						<div class="avatar">
							<img src="assets/avatar_1.png" alt="">

						</div>
						<div class="stars">
							<span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span> <span> <img src="assets/star.png" alt="">
							</span>
						</div>
						<div class="name">Nguyễn Trần Vi</div>

						<div class="text">
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s, when an unknown
								printer took a galley of type and scrambled it to make a type
								specimen book.</p>
						</div>
					</li>
				</ul>
				<div class="next">
					<a href="#"> <img src="assets/next.png" alt="">
					</a>
				</div>
			</div>
		</div>
		<%@ include file="../layout/footer.jsp" %>

	</div>
	
	<script src="script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>