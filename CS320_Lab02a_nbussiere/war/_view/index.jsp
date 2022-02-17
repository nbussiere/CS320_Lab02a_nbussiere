<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Index View</title>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<div>
				<input type="submit" name="addNum" value="Add Numbers!">
				<input type="submit" name="multiplyNum" value="Multiply Numbers!">
				<input type="submit" name="guessGame" value="Guessing Game!">
			</div>
		</form>
	</body>
</html>