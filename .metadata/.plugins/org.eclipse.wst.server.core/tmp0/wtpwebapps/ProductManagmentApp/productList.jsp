<%@page import="com.sathya.servlet.ProductDao" import="java.util.Base64" %>
 <%@ page language="java" contentType="text/html"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Product List</title>
 <!-- BootStrap CDN link to Get the Support of Bootstrap -->
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css">
 </head>
 
<body>
<div class="text-center md-1 text-successs">
<h1> List of Available Products</h1>
</div>
<br>

<div>
<a href="add-product.html" class="btn btn-success">Save Product</a>
</div>

<div>
<input type="text" placeholder="search"/>
</div>
<br>

<div>
<c:if test="${saveResult==1 }">
<h1 class="text-danger  text-center">Data Inserted successfully...</h1>
</c:if>
</div>

<table class="table table-bordered table-striped">
<thead class="thead-dark">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Brand</th>
		<th>Product MadeIn</th>
		<th>Product Manufacturing Date</th>
		<th>Product Expiry Date</th>
		<th>Product Image</th>
		
	</tr>
</thead>
<tbody>
	<c:forEach  var="product"  items="<%=new ProductDao().findAll()%>">
		<tr>
			<td>${product.proId}</td>
			<td>${product.proName}</td>
			<td>${product.proPrice}</td>
			<td>${product.proBrand}</td>
			<td>${product.proMadeIn}</td>
			<td>${product.proMfgDate}</td>
			<td>${product.proExpDate}</td>
			<td> <img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="Product Image" style="max-width:100px; max-height:100px;">
		</tr>
	</c:forEach>
			
</tbody>
		
		
		
		
		
</table>

</body>
</html>                                                                                                           