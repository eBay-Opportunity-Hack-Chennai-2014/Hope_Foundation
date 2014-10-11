<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Create Donor
</h1>
	<form action="registerDonor" method="POST">
		Name : <input type="text" name="name"/><br/>
		DOB : <input type="text" name="dob"/><br/>
		Address: <input type="text" name="address"/><br/>
		Mobile : <input type="text" name="mobile"/><br/>
		Ph No Res : <input type="text" name="phNoRes"/><br/>
		Ph No Ofc : <input type="text" name="phNoOfc"/><br/>
		Email : <input type="text" name="email"/><br/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>
