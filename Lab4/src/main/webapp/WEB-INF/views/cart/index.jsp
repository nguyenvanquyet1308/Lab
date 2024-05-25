<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
<!-- Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Shopping Cart</h2>
    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Amount</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${cart.items}">
                <form action="/cart/update/${item.id}" method="post">
                    <input type="hidden" name="id" value="${item.id}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.price}</td>
                        <td>
                            <input name="qty" value="${item.qty}" class="form-control"
                                   onblur="this.form.submit()" style="width: 70px;">
                        </td>
                        <td>${item.price * item.qty}</td>
                        <td>
                            <a href="/cart/remove/${item.id}" class="btn btn-danger btn-sm">Remove</a>
                        </td>
                    </tr>
                </form>
            </c:forEach>
        </tbody>
    </table>
    <div class="mt-3">
        <a href="/cart/clear" class="btn btn-warning">Clear Cart</a>
        <a href="/item/index" class="btn btn-primary">Add More Items</a>
    </div>
</div>

</body>
</html>
