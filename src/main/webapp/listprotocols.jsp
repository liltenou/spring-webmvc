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
		<form method="GET" action="${pageContext.request.contextPath}/parameter/list" class="navbar-form pull-right">
			<input type="search" class="form-control col-md-8" name="q" placeholder="Search" id="protocolName" value="${searchTerm}"/>
		</form>
	</div>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>Protocol Suite</th>
				<th>Protocol</th>
				<th>Parameter</th>
				<th>Edit | Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listProtocols}" var="protocol">
				<c:forEach var="parameter" items="${protocol.parameters}">
					<tr>
						<td>${protocol.name}</td>
						<td>${protocol.protocol}</td>
						<td>${parameter.name}</td>
						<td><a
							href="${pageContext.request.contextPath}/parameter/edit/${parameter.id}">Edit</a>
							| <a
							href="${pageContext.request.contextPath}/parameter/delete/${parameter.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</c:forEach>
		</tbody>
	</table>
<%@ include file="WEB-INF/common/footer.jsp"%>
</div>

</body>
</html>