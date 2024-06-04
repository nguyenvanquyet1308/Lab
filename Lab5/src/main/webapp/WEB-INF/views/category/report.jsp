<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header">
            <h3>Tồn kho theo loại</h3>
        </div>
        <div class="card-body">
            <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>Loại hàng</th>
                        <th>Tổng giá</th>
                        <th>Số sản phẩm</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${itemReport}">
                        <tr>
                            <td>${item.group.name}</td>
                            <td>${item.sum}</td>
                            <td>${item.count}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>
