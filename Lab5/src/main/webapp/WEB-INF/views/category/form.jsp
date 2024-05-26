<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header">
            <h3 style="text-align: center">Category Form</h3>
        </div>
        <div class="card-body">
            <form:form action="/category/index" modelAttribute="item" class="form">
                <div class="form-group">
                    <form:label path="id" class="form-label">Category Id</form:label>
                    <form:input path="id" placeholder="Category Id?" class="form-control"/>
                </div>
                <div class="form-group">
                    <form:label path="name" class="form-label">Category Name</form:label>
                    <form:input path="name" placeholder="Category Name?" class="form-control"/>
                </div>
                <hr>
                <div class="form-group">
                    <button type="submit" formaction="/category/create" class="btn btn-primary">Create</button>
                    <button type="submit" formaction="/category/update" class="btn btn-warning">Update</button>
                    <a href="/category/delete/${item.id}" class="btn btn-danger">Delete</a>
                    <a href="/category/index" class="btn btn-secondary">Reset</a>
                </div>
            </form:form>
        </div>
    </div>
</div>


</body>
</html>
