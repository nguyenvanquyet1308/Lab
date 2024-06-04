<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="../css/sanpham.css">
	
</head>
<body>

	<%@ include file="../layout/header.jsp" %>
    <div class="container">
        <div class="row">
            <!-- Sidebar for filters -->
            <div class="col-md-3 filter-section">
                <h3>Filter Products</h3>
                <!-- Filter by Name -->
                <div class="form-group">
                    <label for="filterName">Name</label>
                    <input type="text" class="form-control" id="filterName" placeholder="Search by name">
                </div>
                <!-- Filter by Size -->
                <div class="form-group">
                    <label for="filterSize">Size</label>
                    <select class="form-control" id="filterSize">
                        <option value="">All Sizes</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                    </select>
                </div>
                <!-- Filter by Price -->
                <div class="form-group">
                    <label for="filterPrice">Price</label>
                    <input type="range" class="form-control-range" id="filterPrice" min="0" max="300" step="10">
                    <div class="d-flex justify-content-between">
                        <span>$0</span>
                        <span>$300</span>
                    </div>
                </div>
                <!-- Filter by Color -->
                <div class="form-group">
                    <label for="filterColor">Color</label>
                    <select class="form-control" id="filterColor">
                        <option value="">All Colors</option>
                        <option value="black">Black</option>
                        <option value="white">White</option>
                        <option value="red">Red</option>
                        <option value="blue">Blue</option>
                        <option value="green">Green</option>
                    </select>
                </div>
                <!-- Filter by Brand -->
                <div class="form-group">
                    <label for="filterBrand">Brand</label>
                    <select class="form-control" id="filterBrand">
                        <option value="">All Brands</option>
                        <option value="nike">Nike</option>
                        <option value="adidas">Adidas</option>
                        <option value="puma">Puma</option>
                        <option value="reebok">Reebok</option>
                        <option value="new_balance">New Balance</option>
                    </select>
                </div>
                <!-- Filter by Type -->
                <div class="form-group">
                    <label>Type</label>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="typeRunning">
                        <label class="form-check-label" for="typeRunning">
                            Running Shoes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="typeCasual">
                        <label class="form-check-label" for="typeCasual">
                            Casual Shoes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="typeSports">
                        <label class="form-check-label" for="typeSports">
                            Sports Shoes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="typeFormal">
                        <label class="form-check-label" for="typeFormal">
                            Formal Shoes
                        </label>
                    </div>
                </div>
                <button class="btn btn-primary btn-block">Apply Filters</button>
            </div>
            <!-- Main content for products -->
            <div class="col-md-9">
                <h3>All Products</h3>
                <div class="row">
                    <!-- Product 1 -->
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="shoe1.jpg" class="card-img-top" alt="Shoe 1">
                            <div class="card-body">
                                <h5 class="card-title">Shoe 1</h5>
                                <p class="card-text">$50</p>
                                <a href="#" class="btn btn-primary">View Details</a>
                            </div>
                        </div>
                    </div>
                    <!-- Product 2 -->
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="shoe2.jpg" class="card-img-top" alt="Shoe 2">
                            <div class="card-body">
                                <h5 class="card-title">Shoe 2</h5>
                                <p class="card-text">$70</p>
                                <a href="#" class="btn btn-primary">View Details</a>
                            </div>
                        </div>
                    </div>
                    <!-- Product 3 -->
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="shoe3.jpg" class="card-img-top" alt="Shoe 3">
                            <div class="card-body">
                                <h5 class="card-title">Shoe 3</h5>
                                <p class="card-text">$100</p>
                                <a href="#" class="btn btn-primary">View Details</a>
                            </div>
                        </div>
                    </div>
                    <!-- More products... -->
                </div>
            </div>
        </div>
    </div>

	
	<%@ include file="../layout/footer.jsp" %>
    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>