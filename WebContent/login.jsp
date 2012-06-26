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
	function onload() {
		console.log(window.screen.availHeight - 135);
		var contaner = document.getElementById("container");
		contaner.style.height = (window.screen.availHeight - 135) + "px";
		;
	}
	function submitform() {
		return 1;
	}
	function validator(){
		//var user = document.getElementById("user");
		if (this.value.length < 6)
			console.log("Size must be bigger than " + this.value.length + "");
	}
</script>
</head>
<body onload="onload();">
	<form action="index.jsp" method="post">
		<div id="container" class="container">
			<div class="example">
				<fieldset style="height: 100%; border-radius: 15px;">
					<legend>Authorization details:</legend>
					<div>
						<label for="user">Username:</label> <input name="user" id="user"
							type="text" value="" placeholder="Enter your username" onkeyup="JavaScript: validator(this);"/>
						<div style="width: 24px"></div>
					</div>

					<div style="">
						<label for="password">Password:</label> <input name="password"
							id="password" value="" type="password"
							placeholder="Enter password" /> <input type="image" value=""
							src="images/arrow.png"
							style="position: relative; width: 24px; height: 24px; top: 33%"
							onclick="submitform();" />
					</div>
				</fieldset>

			</div>
		</div>
	</form>
</body>
</html>