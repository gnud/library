<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome - *Foolish* mortals</title>
<style>
.example {
	display: block;
	display: box; /* As specified */
	display: -moz-box; /* Mozilla */
	display: -webkit-box; /* WebKit */
	/* Children should be oriented vertically */
	box-orient: horizontal; /* As specified */
	-moz-box-orient: horizontal; /* Mozilla */
	-webkit-box-orient: horizontal; /* WebKit */
	/* Align children to the horizontal center of this box */
	box-align: center; /* As specified */
	-moz-box-align: center; /* Mozilla */
	-webkit-box-align: center; /* WebKit */
	/* Pack children to the bottom of this box */
	box-pack: center; /* As specified */
	-moz-box-pack: center; /* Mozilla */
	-webkit-box-pack: center; /* WebKit */
	/*	height: 70px;
	width: 600px;*/
	margin: 0 auto;
	line-height: 50px;
}

.container {
	background: yellow;
	display: block;
	display: box; /* As specified */
	display: -moz-box; /* Mozilla */
	display: -webkit-box; /* WebKit */
	/* Children should be oriented vertically */
	box-orient: vertical; /* As specified */
	-moz-box-orient: vertical; /* Mozilla */
	-webkit-box-orient: vertical; /* WebKit */
	/* Align children to the horizontal center of this box */
	box-align: center; /* As specified */
	-moz-box-align: center; /* Mozilla */
	-webkit-box-align: center; /* WebKit */
	/* Pack children to the bottom of this box */
	box-pack: center; /* As specified */
	-moz-box-pack: center; /* Mozilla */
	-webkit-box-pack: center; /* WebKit */
	margin: 0 0;
	width: 100%;
	text-align: center;
}

-webkit-input-placeholder,input:-moz-placeholder {
	color: red;
}
</style>
<script type="text/javascript">
	
</script>
</head>

<h1 style="text-decoration: underline;">Rename form:</h1>
<FORM NAME="form1" METHOD="POST" action="Bookmanager">
	<INPUT type="hidden" NAME="action" value="2" />
	<INPUT TYPE="text" ID="id" NAME="id" value="${book.id}" />
	<INPUT TYPE="text" ID="title" NAME="title" value="${book.title}" />
	<INPUT TYPE="submit"
		VALUE="Send" />
</FORM>
<a href="list.jsp?action=4">Cancel</a>
</body>
</html>