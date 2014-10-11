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
	<form action="createDonor">
		Name : <input type="text" name="name"/><br/>
		Address: <input type="text" name="address"/><br/>
		City : <input type="text" name="city"/><br/>
		State : <input type="text" name="state"/><br/>
		Country : <input type="text" name="country"/><br/>
		Mobile : <input type="text" name="mobile"/><br/>
		Email : <input type="text" name="email"/><br/>
		OtherDetails : <input type="text" name="otherdetails"/><br/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>
