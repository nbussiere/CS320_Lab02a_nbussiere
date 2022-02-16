<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		This is the index view jsp
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
