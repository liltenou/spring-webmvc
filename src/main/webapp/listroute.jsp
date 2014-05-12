<%@ include file="WEB-INF/common/header.jsp"%>
<!-- list all existing protocol and parameters -->

<div class="main"></div>

<!-- existing file transfers section -->
<!-- file transfer inventory header -->
<div class="container">

	<a class="btn btn-primary icon add-file"
		href=<c:url value="/filetransfer/add" /> type="button">Add New
		File Transfer</a> <a class="btn btn-primary icon add-file"
		href=<c:url value="/parameter/list"/> type="button">Protocol
		Properties List</a>
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
				<th>Producer</th>
				<th>Filename</th>
				<th>Consumer</th>
				<th>Protocol Suite</th>
				<th>Edit | Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listConsumers}" var="consumer">
				<%-- 				<c:forEach items="${consumer.protocolIdFk}" var="protocol"> --%>
				<tr>
					<td>${consumer.producerIdFk.name}</td>
					<td>${consumer.producerIdFk.filename}</td>
					<td>${consumer.name}</td>
					<td>${consumer.protocolIdFk.name}</td>
					<td><a
						href="${pageContext.request.contextPath}/filetransfer/edit/${consumer.protocolIdFk.id}">Edit</a>
						| <a
						href="${pageContext.request.contextPath}/filetransfer/delete/${consumer.protocolIdFk.id}">Delete</a></td>
				</tr>
				<%-- 				</c:forEach> --%>
			</c:forEach>


			<%-- 							<c:forEach items="${listProtocols}" var="protocol"> --%>
			<%-- 				<c:forEach var="parameter" items="${protocol.parameters}"> --%>
			<!-- 					<tr> -->
			<%-- 						<td>${protocol.name}</td> --%>
			<%-- 						<td>${protocol.protocol}</td> --%>
			<%-- 						<td>${parameter.name}</td> --%>
			<!-- 						<td><a -->
			<%-- 							href="${pageContext.request.contextPath}/parameter/edit/${parameter.id}">Edit</a> --%>
			<!-- 							| <a -->
			<%-- 							href="${pageContext.request.contextPath}/parameter/delete/${parameter.id}">Delete</a></td> --%>
			<!-- 					</tr> -->
			<%-- 				</c:forEach> --%>
			<%-- 			</c:forEach> --%>




		</tbody>
	</table>
	<%@ include file="WEB-INF/common/footer.jsp"%>
</div>
<!-- end existing file transrer section  -->
</body>
</html>