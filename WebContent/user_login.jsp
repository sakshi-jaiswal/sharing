<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" type="text/css" href="styles/login.css">
</head>
<body>
<h1>Sign In</h1>
<form action="UserLogin" method="post">
<table>
<tr>
<td>User Id:</td>
<td><input type="text" name="uid"  id="uid"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pass"  id="pass"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit"></td>

</tr> 
 </table>
 </form>
     
</body>
</html>