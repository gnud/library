<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="Bookmanager?action=0">Back </a>
	<div>List of all books:</div>
	<hr />
	<table>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.title}
					<a href="Bookmanager?action=6&id=${book.id}&title=${book.title}"> [View]</a>
					<a href="Bookmanager?action=5&id=${book.id}&title=${book.title}"> [Rename]</a>
					<a href="Bookmanager?action=3&id=${book.id}"> [Delete]</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
</body>
</html>