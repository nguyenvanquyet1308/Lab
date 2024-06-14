<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <link rel="stylesheet" href="../css/dangnhap.css">
</head>

<body>
<%@ include file="../layout/header.jsp" %>
    <div class="login-container">
        <h2 class="text-center mb-4">Login</h2>
        <form action="/trangchu/dangNhap" method="post">
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input  class="form-control" name ="email" id="email" placeholder="Enter email" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="Password" required >
            </div>
            <div class="d-grid"> <button type="submit" class="btn btn-primary ">Login</button></div>
           
            <div class="form-text mt-3 ">
                <a href="#">Forgot password?</a> | <a href="#">Sign up</a>
            </div>
        </form>
    </div>
<%@ include file="../layout/footer.jsp" %>
    <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>