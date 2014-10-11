<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="makeDonation" method="POST">
		<h3>Needs</h3>
		Food : <input name="food" type="text"/>
		Clothing : <input name="clothing" type="text"/>
		Medical : <input name="medical" type="text"/>
		Education : <input name="education" type="text"/>
		<h3>Wishes</h3>
		Wish-Desc : <input name="wish-id" type="text"/>
		<input type="submit" name="Submit" />
	</form>
</body>
</html>