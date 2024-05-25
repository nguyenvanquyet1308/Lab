<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="height: 70vh; display: flex; align-items: center; justify-content: center; background-color: #F8F4E1"> 


<div>
                
            <h1>name: ${sv.name}</h1>
            <h1>email: ${sv.email}</h1>
            <h1>marks: ${sv.marks}</h1>
            <h1>gender: ${sv.gender  ? "Male" : "Female" } </h1>
            <h1>faculty: ${sv.faculty}</h1>
        
</div>
       
</body>
</html>