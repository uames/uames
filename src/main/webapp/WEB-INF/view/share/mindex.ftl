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
				<div class="col-md-3 bg-info k g6" draggable="true">Read</div>
				<div class="col-md-3 bg-primary k gc" draggable="true">Song</div>
				<div class="col-md-3 bg-success k g0" draggable="true">Video</div>
			</div>
			<div class="row">
				<div class="col-md-6 bg-warning k g3" draggable="true">Image</div>
				<div class="col-md-3 bg-danger k g6" draggable="true">Film</div>
			</div>
		</div>
	</body>
</html>