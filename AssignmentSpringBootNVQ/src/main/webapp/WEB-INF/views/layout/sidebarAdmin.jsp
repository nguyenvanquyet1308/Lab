<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body {
            display: flex;
        }

        .sidebar {
            width: 200px; /* Độ rộng của sidebar */
            background-color: #f2f2f2; /* Màu nền của sidebar */
            padding: 20px; /* Khoảng cách giữa nội dung và viền của sidebar */
            box-sizing: border-box;
            /* Đảm bảo rằng padding được tính vào kích thước */
            position: fixed;
            height: 100%;
             height: 100vh;
            position: fixed;
            top: 0;
            left: 0;
            width: 200px;
            background-color: #f2f2f2;
            padding: 20px;
            font-size: 12px;
        }

        .sidebar a {
            color: black;
            padding: 1rem;
            text-decoration: none;
            display: block;
        }

        .sidebar a:hover {
            background-color: #495057;
        }

        .content {
            margin-left: 250px;
            padding: 1rem;
        }
    </style>
</head>
<body>
    <!-- sidebar.html -->
    <div class="sidebar">
        <a href="/category/index" class="nav-link">Quản lý Loại</a>
        <a href="/QLCustomer" class="nav-link">Quản lý Người Dùng</a>
         <a href="/QLProduct" class="nav-link">Quản lý Sản Phẩm</a>
        <a href="/QLProduct" class="nav-link">Quản lý Đơn Hàng</a>
        <a href="" class="nav-link">Thống kê</a>
    </div>


    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
