<%@ include file="WEB-INF/common/header.jsp"%>
<!-- add new parameters to existing protocol -->


<div class="container">

	<div class=page-header>
		<h1>Edit Protocol Parameter</h1>
	</div>
	<!--  end page header -->


	<form:form method="POST"
		action="${pageContext.request.contextPath}/parameter/edit/${parameter.id}">

		<div class="form-group">
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" path="name" value="${parameter.name}" />
			</div>
		</div>
		<form:input type="hidden" value="${parameter.protocolIdFk}"
			path="protocolIdFk" />
		<!--end parameters -->
		<button style="float: right" type="submit" class="btn icon save">Submit</button>
	</form:form>
	<%@ include file="WEB-INF/common/footer.jsp"%>
</div>
<!-- end accordion group -->

</body>
</html>