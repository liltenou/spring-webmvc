<%@ include file="WEB-INF/common/header.jsp" %>
<!-- view protocol page -->


	<div class="main"></div>


	<!-- existing file transfers section -->
	<!-- file transfer inventory header -->
	<div class="container">
		<a class="btn btn-primary icon add-file" href="${pageContext.request.contextPath}/protocol/add"
			type="button">Add Protocol</a> <a
			class="btn btn-primary icon add-file" href="${pageContext.request.contextPath}/parameter/add"
			type="button">Add Parameters to Protocol</a>
		<hr>
		<div class="navbar navbar-default">
			<div class="navbar-header">
				<div class="navbar-brand">Protocol / Parameter Inventory</div>
			</div>
			<form action="#" class="navbar-form pull-right">
				<input class="form-control col-md-8" name="searchInv" type="text"
					placeholder="Search" id="searchInv"></input>
			</form>
		</div>
		<!-- end file transfer inventory header -->

		<!-- list existing file transfers  -->
		<c:forEach items="${protocols}" var="protocol"></c:forEach>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Description</th>
					<th>Parameter</th>
					<th>Protocol</th>
					<th>Edit | Delete</th>
				</tr>
			</thead>
			<tbody>
				
					<tr>
						<td>${protocols.id}</td>
						<td>${protocols.name}</td>
						<td>${protocols.protocol}</td>
						<td>test</td>
						<td><a
							href="${pageContext.request.contextPath}/protocol/edit/${protocol.id}">Edit</a>
							| <a
							href="${pageContext.request.contextPath}/team/edit/${protocol.id}">Delete</a></td>
					</tr>
			</tbody>
		</table>
		<!-- end list existing file transfer -->
	</div>
	<!-- end existing file transfer section  -->
</body>
</html>