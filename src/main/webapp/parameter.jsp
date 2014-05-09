<%@ include file="WEB-INF/common/header.jsp"%>
<!-- add new parameters to existing protocol -->

<!-- main page content -->
<div class="container">
	<!--  page header -->
	<div class=page-header>
		<h2>Select Protocol then add it's parameters</h2>
	</div>
	<!--  end page header -->

	<form:form method="POST"
		action="${pageContext.request.contextPath}/parameter/add/process">

		<div class="form-group">
			<div class="field">
				<form:select class="form-control" path="protocolIdFk"
					required="true" itemValues="id">
					<form:option value="${null}" label="-- Select Protocol --" />
					<c:forEach var="protocol" items="${listProtocolName}">
						<form:option value="${protocol.id}">${protocol.name}</form:option>
					</c:forEach>
				</form:select>

			</div>
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" placeholder="Add Parameter" name="name" path="name" />
				<Label>Add Parameter</Label>
			</div>

		</div>

		<!-- add parameters -->
		<div class="cascade">
			<div class="form-group" id="parameter-group">
				<div class="form-group" id="parameter-new"></div>
			</div>
		</div>
		<!--end parameters -->
		<button style="float: right" type="submit" class="btn icon save">Submit</button>
	</form:form>
	<%@ include file="WEB-INF/common/footer.jsp"%>
</div>

</body>
</html>