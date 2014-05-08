<%@ include file="WEB-INF/common/header.jsp"%>
<!-- view protocol page -->


<div class="main"></div>


<!-- existing file transfers section -->
<!-- file transfer inventory header -->
<div class="container">
	<a class="btn btn-primary icon add-file"
		href="${pageContext.request.contextPath}/protocol/add" type="button">Add
		Protocol</a> <a class="btn btn-primary icon add-file"
		href="${pageContext.request.contextPath}/parameter/add" type="button">Add
		Parameters to Protocol</a>
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
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>#</th>
				<th>Description</th>
				<th>Protocol</th>
				<th>Parameter</th>
				<th>Edit | Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listProtocols}" var="protocol">

				<tr>
					<td>${protocol.id}</td>
					<td>${protocol.name}</td>
					<td>${protocol.protocol}</td>
					<td><c:forEach var="t" items="${protocol.parameter}">${t.name}</c:forEach></td>
					<td><a
						href="${pageContext.request.contextPath}/protocol/edit/${protocol.id}">Edit</a>
						| <a
						href="${pageContext.request.contextPath}/protocol/delete${protocol.id}">Delete</a></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
	<!-- end list existing file transfer -->
</div>
<!-- end existing file transfer section  -->
</body>
</html>