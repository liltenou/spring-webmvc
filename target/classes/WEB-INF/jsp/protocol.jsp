<!-- Add new protocol page -->
<!DOCTYPE>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Broadapp</title>
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
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">

				<a class="navbar-brand" href=/listroute.jsp><b>BROADRIDGE</b></a>
			</div>
		</div>
	</div>
	<form action="protocol.htm" method="post">
		<div class="container">
			<!--  page header -->
			<div class=page-header>
				<h2>Create a new protocol</h2>
			</div>
			<div>
				<p>
					The protocol created here will be added to the protocol dropdown
					list. Remember to go to the <a href="parameter.jsp">Add Parameters to
						Protocol Page</a> to add Protocol parameters
				</p>
			</div>

			<div class="accordion" id="accordion2">
				<div class="accordion-group">

					<!-- protocol  info -->
					<div class="form-group">
						<div class="field">
							<input class="form-control" type="text" pattern=".+" required
								placeholder="Enter Protocol" name="protocol" /> <Label>Protocol</Label>
						</div>
						<div class="field">
							<input class="form-control" type="text" pattern=".+" required
								placeholder="Protocol Suite Name" name="name" /> <Label>Protocol
								Suite Name</Label>
						</div>
						<div class="field">
							<button type="button" class="btn icon save">Save</button>
						</div>
						<div class="field">
							<!-- 				<input class="no-border" type="image" -->
							<!-- 					src="../resources/images/delete.png" name="saveForm" id="saveForm" />Delete -->
							<!-- 						<button type="button" class="btn icon delete">Delete</button> -->
						</div>
					</div>
					<!-- end producer filename info -->


					<!-- add paramateres -->
					<div class="cascade">
						<div class="form-group" id="parameter-group">
							<div class="form-group" id="parameter-new"></div>
						</div>
					</div>
					<!--end parameters -->
					<button style="float: right" type="Submit" class="btn icon save">Submit</button>
				</div>

			</div>
		</div>
	</form>
</body>
</html>