<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Checkout Form</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
	<link rel="stylesheet" href="../css/sanpham.css">
	    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            font-size: 12px;
        }
        .form-group label {
            font-weight: bold;
        }
        .payment-methods img {
            width: 30px;
            height: 30px;
        }
        .btn-payment {
            background-color: #dc3545;
            color: white;
            font-weight: bold;
        }
    </style>

</head>
<body>
	<%@ include file="../layout/header.jsp"%>
	 <div class="container">
        <div class="row">
            <div class="col-md-8">
                <h4>Thông tin liên hệ giao hàng</h4>
                <form>
                    <div class="form-group">
                        <label for="name">Họ và tên *</label>
                        <input type="text" class="form-control" id="name" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" placeholder="Không bắt buộc">
                    </div>
                    <div class="form-group">
                        <label for="phone">Số điện thoại *</label>
                        <input type="tel" class="form-control" id="phone" required>
                    </div>

                    <h4>Địa chỉ giao hàng</h4>
                    <div class="form-group">
                        <label for="city">Chọn tỉnh thành *</label>
                        <select class="form-control" id="city" required>
                            <option>--- Chọn tỉnh thành ---</option>
                            <!-- Add options here -->
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="district">Chọn quận huyện *</label>
                        <select class="form-control" id="district" required>
                            <option>Bạn chưa chọn tỉnh thành</option>
                            <!-- Add options here -->
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="ward">Tên phường/Xã *</label>
                        <input type="text" class="form-control" id="ward" required>
                    </div>
                    <div class="form-group">
                        <label for="address">Số nhà, tên đường *</label>
                        <input type="text" class="form-control" id="address" required>
                    </div>
                    <div class="form-group">
                        <label for="note">Ghi chú</label>
                        <textarea class="form-control" id="note" rows="3"></textarea>
                    </div>

                    <h4>Hình thức thanh toán</h4>
                    <div class="payment-methods">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="paymentMethod" id="cod" value="cod"
                                checked>
                            <label class="form-check-label" for="cod">
                               <i class="fa-solid fa-wallet"></i> COD
                                <small class="text-muted">Thanh toán khi nhận hàng</small>
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="paymentMethod" id="cash"
                                value="cash">
                            <label class="form-check-label" for="cash">
                                <i class="fa-solid fa-money-bill-1-wave"></i> Tiền mặt
                                <small class="text-muted">Chỉ áp dụng khi mua hàng tại shop</small>
                            </label>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-payment btn-block mt-4">THANH TOÁN 345K
                        (UNDEFINED)</button>
                </form>
            </div>
            <div class="col-md-4">
                <form action="">
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Email</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>John</td>
                                <td>Doe</td>
                                <td>john@example.com</td>
                            </tr>
                            <tr>
                                <td>Mary</td>
                                <td>Moe</td>
                                <td>mary@example.com</td>
                            </tr>
                            <tr>
                                <td>July</td>
                                <td>Dooley</td>
                                <td>july@example.com</td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </div>

	<%@ include file="../layout/footer.jsp"%>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<script src="https://kit.fontawesome.com/bff65d775c.js"
		crossorigin="anonymous"></script>
</body>
</html>
