<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="VendorRegistration">
<table>

<tr>
<td>First Name:</td>
<td><input type="text" name="fname" id="fname"></td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lname" id="lname"></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="age" id="age"></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" name="gender" value="Male" id="gender">Male</td>
<td><input type="radio" name="gender" value="Female" id="gender">Female</td>
</tr>
<tr>
<td>Contact Number:</td>
<td><input type="text" name="cno"id="cno"></td>
</tr>
<tr>
<td>E-mail Id:</td>
<td><input type="text" name="age" id="age"></td>
</tr>
<tr>
<td>Vendor Id:</td>
<td><input type="text" name="vid" id="vid"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pass" id="pass"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit"></td>

</tr>


</form>
</table>
</body>
</html>