<!-- add protocol parameters  -->
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Broadapp</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href=<c:url value="/resources/css/styles.min.css" /> />
<link rel="stylesheet" href=<c:url value="/resources/css/base.css" /> />
<script src="/resources/js/base.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

</head>
<body>

	<!-- static navbar -->
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">

				<a class="navbar-brand" href=<c:url value="/listroute.jsp"/>><b>BROADRIDGE</b></a>
			</div>
		</div>
	</div>
	<!-- end static navbar -->

	<!-- main page content -->
	<div class="container">
		<!--  page header -->
		<div class=page-header>
			<h2>Select Protocol then add it's parameters</h2>
		</div>
		<!--  end page header -->

		<div class="accordion" id="accordion2">
			<div class="accordion-group">

				<!-- producer filename info -->
				<div class="form-group">
					<div class="field">
						<select class="form-control"><option>Select
								Protocol</option>
							<option>----------------</option>
							<option>ConnectDirect</option>
							<option>FTP</option>
							<option>Mailbox</option>
							<option>SFTP</option>
						</select>
					</div>
					<div class="field">
						<input class="form-control" type="text" pattern=".+" required
							placeholder="Description" name="description" /> <Label>Description</Label>
					</div>
					<div class="field">
						<!-- 				<input class="no-border" type="image" -->
						<!-- 					src="../resources/images/save.png" name="saveForm" id="saveForm" />Save -->
						<button type="button" class="btn icon save"
							onclick="add_parameter();">Save</button>
					</div>
					<div class="field">
						<!-- 				<input class="no-border" type="image" -->
						<!-- 					src="../resources/images/delete.png" name="saveForm" id="saveForm" />Delete -->
						<!-- 						<button type="button" class="btn icon delete">Delete</button> -->
					</div>
				</div>
				<!-- end producer filename info -->


				<!-- add parameters -->
				<div class="cascade">
					<div class="form-group" id="parameter-group">
						<div class="form-group" id="parameter-new"></div>
					</div>
				</div>
				<!--end parameters -->
				<button style="float: right" type="button" class="btn icon save">Submit</button>
			</div>
			<!-- end accordion group -->
		</div>
		<!-- end accordion -->
	</div>
	<!-- end main page content -->
</body>
</html>