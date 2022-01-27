<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Boat Price Prediction</title>
</head>

<body>

<h2>Boat Price Predictions:</h2>
<table>
<tr>
<th>Id</th> 
<th>Boat Type</th>
<th>Year Built</th>
<th>Boat Length</th>
<th>Boat Width</th>
<th>Fuel Type</th>
<th>Price Prediction</th>
</tr>

<j:forEach items="${boatList}" var="boats">
<tr>
<td>${boats.get(0)}</td>
<td>${boats.get(1)}</td>
<td>${boats.get(2)}</td>
<td>${boats.get(3)}</td>
<td>${boats.get(4)}</td>
<td>${boats.get(5)}</td>
<td>${boats.get(6)}</td>
<td><a href="deleteBoat?id=${boats.get(0)}">Delete</a></td>

<td><a href="showUpdate?id=${boats.get(0)}">Edit</a></td>
</tr>
</j:forEach>
</table>
<a href="showCreate">Add Boat Price Prediction</a>


  			
</body>
</html>