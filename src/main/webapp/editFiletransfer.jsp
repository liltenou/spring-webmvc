<%@ include file="WEB-INF/common/header.jsp"%>

<div class="container">
	<!--  page header -->
	<div class=page-header>
		<h2>Create New File Transfer</h2>
	</div>
	<!--  end page header -->


	<!-- producer filename info -->
	<div class="form-group">
		<form:form method="POST"
			action="${pageContext.request.contextPath}/filetransfer/add/process">
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" placeholder="Producer" path="producerName"
					value="${consumer.producerIdFk.name}" />
				<Label>Producer</Label>
			</div>
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" placeholder="Filename" path="filename"
					value="${consumer.producerIdFk.filename}" />
				<Label>Filename</Label>
			</div>
			<div class="cascade">
				<div class="form-group" id="consumer-group">
					<div class="field">
						<form:input class="form-control" type="text" pattern=".+"
							required="" placeholder="Consumer" path="consumerName"
							value="${consumer.name}" />
						<Label>Consumer</Label>
					</div>
					<div class="field">
						<form:input class="form-control" type="text" readonly="true"
							value="${consumer.protocolIdFk.name}" path="producerName" />
					</div>
					<div class="cascade">
						<table class="table table-striped table-hover ">
							<thead>
								<tr>
									<th>Parameters</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${parameters}" var="params">
									<tr>
										<td>${params.name}<form:input class="form-control"
												type="text" path="paramValue" /> <form:input type="hidden"
												value="${params.id}" path="parameterIdFk" /> <form:input
												type="hidden" value="" path="consumerIdFk" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<button style="float: right" type="submit" class="btn icon save">Submit</button>

					</div>
				</div>
		</form:form>

		<!-- end outer cascade -->

	</div>
</div>

<%@ include file="WEB-INF/common/footer.jsp"%>

</body>
</html>