<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<title>Web bán thức ăn</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<style>

</style>
<body>
<c:url var="home" value="/views" />

	<div id="wrapper">
		<div id="header">
			<a href="" class="logo"> <img src="${pageContext.request.contextPath}/image/logogiay1.jpg" alt="">
			</a>
			<div id="menu">
				<div class="item">
					<a href="${home}/trangchu">Trang chủ</a>
				</div>
				<div class="item">
					<a href="${home}/sanpham">Sản phẩm</a>
				</div>
				<div class="item">
					<a href="${home}/blog">Blog</a>
				</div>
				<div class="item">
					<a href="${home}/lienhe">Liên hệ</a>
				</div>
			</div>
			<div id="actions">
				<div class="item">
					<img src="${pageContext.request.contextPath}/assets/user.png" alt="">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/assets/cart.png" alt="">
				</div>
			</div>
		</div>
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
				<img src="${pageContext.request.contextPath}/image/3soc.jpg" alt=""> <img src="${pageContext.request.contextPath}/image/3soc1.jpg"
					alt=""> <img src="${pageContext.request.contextPath}/image/gucci.jpg" alt="">
			</div>
			<div class="to-bottom">
				<a href=""> <img src="assets/to_bottom.png" alt="">
				</a>
			</div>
		</div>
		<div class="row row-cols-1 row-cols-md-3 g-5 py-5">
			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/gucci.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
					</div>
				</div>
			</div>

			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/gucci1.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
					</div>
				</div>
			</div>

			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/gucci2.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
					</div>
				</div>
			</div>

			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/gucci3.webp" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/jordan.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
					</div>
				</div>
			</div>

			<div class="col">
				<div class="card">
					<img src="${pageContext.request.contextPath}/image/jordan1.webp" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Giày NIKE</h5>
						<p class="card-text">Giày Nike Chính Hãng, Nhiều mẫu mới nhập
							liên tục, Chính Hãng 100%, Giá Rẻ Nhất Thị Trường, Ship Cod Toàn
							quốc, bảo hành chính hãng trọn đời.</p>
					</div>
					<div class="mb-5 d-flex justify-content-around">
						<h3>190$</h3>
						<button class="btn btn-primary">Buy Now</button>
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
							<img src="${pageContext.request.contextPath}/assets/avatar_1.png" alt="">

						</div>
						<div class="stars">
							<span> <img src="${pageContext.request.contextPath}/assets/star.png" alt="">
							</span> <span> <img src="${pageContext.request.contextPath}/assets/star.png" alt="">
							</span> <span> <img src="${pageContext.request.contextPath}/assets/star.png" alt="">
							</span> <span> <img src="${pageContext.request.contextPath}/assets/star.png" alt="">
							</span> <span> <img src="${pageContext.request.contextPath}/assets/star.png" alt="">
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
							<img src="${pageContext.request.contextPath}/assets/avatar_1.png" alt="">

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
<jsp:include page="${view}" />
		
			<jsp:include page="footer/footer.jsp" />
	</div>
	<script src="script.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>

</html>