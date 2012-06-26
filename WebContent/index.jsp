<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Library - Member access</title>
</head>
<body>
	<h1>Add a new book</h1>
	<FORM NAME="form1" METHOD="POST" action="Bookmanager">
		<INPUT type="hidden" NAME="action" value="1" />
		<label for="author">Author</label><select ID="author" NAME="author">
			<c:forEach var="author" items="${authors}">
				<option value="${author.id}">${author.fullname}</option>
			</c:forEach>
		</select> <br /> <label for="title">Title</label><INPUT TYPE="text" ID="title"
			NAME="title" /> <INPUT TYPE="submit" VALUE="Send" />
	</FORM>
	<a href="Bookmanager?action=4">List Books:</a>
</body>
</html>