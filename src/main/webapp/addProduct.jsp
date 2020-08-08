<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Listing</title>
</head>
<body>
	<form action="AddProductServlet" method="post">
		Enter id : <input type="text" name="id" /> <br/>
		Enter name: <input type="text" name="name" /> <br/>
		Enter price: <input type="text" name="price" /> <br/>
		
		<button type="submit">Add</button> 	
	</form>
</body>
</html>