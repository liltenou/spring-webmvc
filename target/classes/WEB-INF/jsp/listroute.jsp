<!--  landing page -->
<!DOCTYPE>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Broadapp</title>
<BASE href="<c:url value="/broadui/" />">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="<c:url value="/resources/css/styles.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/base.css"/>" />
<script src="/resources/js/base.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
	<!-- top nav bar -->
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/broadui/listroute.jsp"><b>BROADRIDGE</b></a>
			</div>
		</div>
	</div>
	<!-- end top navbar  -->

	<div class="main"></div>

	<!-- existing file transfers section -->
	<!-- file transfer inventory header -->
	<div class="container">

		<a class="btn btn-primary icon add-file" href=<c:url value="/addnew.jsp" /> type="button">Add
			New File Transfer</a> <a class="btn btn-primary icon add-file"
			href=<c:url value="/listprotocols.jsp"/> type="button">Protocol Properties List</a>
		<hr>
		<div class="navbar navbar-default">
			<div class="navbar-header">
				<div class="navbar-brand">File Transfer Inventory</div>
			</div>
			<form action="#" class="navbar-form pull-right">
				<input class="form-control col-md-8" name="searchInv" type="text"
					placeholder="Search" id="searchInv"></input>
			</form>
		</div>
		<!-- end file transfer inventory header -->

		<!-- list existing file transfers  -->
		<table class="table table-striped table-hover ">
			<thead>
				<tr>
					<th>#</th>
					<th>Producer</th>
					<th>Filename</th>
					<th>Consumer</th>
					<th>Protocol</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>4</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>5</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>6</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr>
					<td>7</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
			</tbody>
		</table>
		<!-- end list existing file transfer -->
	</div>
	<!-- end existing file transrer section  -->
</body>
</html>