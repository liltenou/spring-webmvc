<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>Broadapp</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href=<c:url value="/resources/css/styles.css"/> />
<link rel="stylesheet" href=<c:url value="/resources/css/base.css" /> />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src=<c:url value="/resources/js/bootstrap.min.js"/>></script>
<script src=<c:url value="/resources/js/base.js"/>></script>

</head>

<body>
	<!-- top nav bar -->
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
			<ul class="nav navbar-nav">
				<li><a class="navbar-brand" href=<c:url value="/"/>><b>HOME</b></a></li>
				<li><a href=<c:url value="/parameter/list"/>>Parameter List</a></li>
				<li><a href=<c:url value="/filetransfer/add/"/>>Add New File Transfer</a></li>
			</ul>
			</div>
		</div>
	</div>
	<!-- end top navbar  -->