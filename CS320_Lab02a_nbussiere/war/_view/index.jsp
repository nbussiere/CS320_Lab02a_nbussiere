<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		Welcome!
		<br>
		Which program would you like to run?
		<br>
		<form action="${pageContext.servletContext.contextPath}/Index" method="post">
			<table>
				<tr>
					<input type="Submit" name="submit" value="Add Numbers!">
				</tr>
				<tr>
					<input type="Submit" name="submit" value="Multiply Numbers!">
				</tr>
			
				<tr>
					<input type="Submit" name="submit" value="Guessing Game!">
				</tr>
			</table>
			
		</form>
	</body>
</html>
