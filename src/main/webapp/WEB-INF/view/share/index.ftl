<!DOCTYPE html>
<html>
	<head>
		<title>share with you</title>
		
		<meta name="keywords" content="阅读，分享" />
		<meta name="description" content="阅读，分享">
		<#include "/share/head.ftl">
		<style>
			.k {
				padding:100px;
				margin:10px;
				border-radius:5px;
				cursor:pointer;
				font:italic bold 35px arial,sans-serif;
			}
		</style>
	</head>
	<body class="bggray">
		<div class="container">
			<div class="row">
				<a href="${rc.contextPath}/share/read.htm" class="col-md-3 bg-info k g6" draggable="true">Read</a>
				<a href="${rc.contextPath}" class="col-md-3 bg-primary k gc" draggable="true">Song</a>
				<a href="${rc.contextPath}" class="col-md-3 bg-success k g0" draggable="true">Video</a>
			</div>
			<div class="row">
				<a href="#" class="col-md-6 bg-warning k g3" draggable="true">Image</a>
				<a class="col-md-3 bg-danger k g6" draggable="true">Film</a>
			</div>
		</div>
	</body>
</html>