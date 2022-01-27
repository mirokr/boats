<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Register User</title>
</head>
<body>
<form action="registerUser" method="post">
<h2>User Registration:</h2>
<table>
<tr>
<td><label>First Name:</label></td>
<td><input type="text" 	   name="firstName"/></td>
</tr>
<tr>
<td><label>Last Name:</label></td>
<td><input type="text"     name="lastName"/></td>
</tr>
<tr>
<td><label>User Name:</label></td>
<td><input type="text" 	   name="email"/></td>
</tr>
<tr>
<td><label>Password:</label></td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td><label>Confirm Password:</label></td>
<td><input type="password" name="confirmPassword"/></td>
</tr>

</table>

<input type="submit" value="Register"/>

</form>
${msg}

</body>
</html>