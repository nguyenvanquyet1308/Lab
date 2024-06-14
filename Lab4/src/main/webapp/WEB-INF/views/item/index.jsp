<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Items List</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Items List</h2>
    <ul class="list-group">
        <c:forEach var="item" items="${items}">
            <li class="list-group-item d-flex justify-content-between align-items-center">
                ${item.name} (${item.price})
                <a href="/cart/add/${item.id}" class="btn btn-primary btn-sm">Add To Cart</a>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
