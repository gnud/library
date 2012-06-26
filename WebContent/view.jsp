<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book viewer - ${book.title}</title>

</head>
<body>
	<a href="Bookmanager?action=4">Back </a>
	<h1>Title: ${book.title}</h1>
	<hr />
	<div style="width: 1800px; height: 800px; background-color: red">
		<fieldset
			style="height: 100%; width: 40%; float: left; top: 0px; border-radius: 15px;">
			<legend>Book details:</legend>
			<div>
				<label for="author">Author:</label>
				<div id="author">|${book.author.name}|</div>
			</div>
		</fieldset>
		<fieldset
			style="width: 960px; height: 680px; float: right; top: 0px; border-radius: 15px;">
			<legend>Book Cover:</legend>
			<div>
				<img src="images/cover.jpg" style="width: 960px; height: 668px" />
			</div>
		</fieldset>
	</div>
</body>
</html>