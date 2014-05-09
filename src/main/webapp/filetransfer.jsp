<%@ include file="WEB-INF/common/header.jsp"%>

<div class="container">
	<!--  page header -->
	<div class=page-header>
		<h2>Create New File Transfer</h2>
	</div>
	<!--  end page header -->

	<form:form method="POST"
		action="${pageContext.request.contextPath}/filetransfer/add/process">
		<!-- producer filename info -->
		<div class="form-group">
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" placeholder="Producer" path="producerName" />
				<Label>Producer</Label>
			</div>
			<div class="field">
				<form:input class="form-control" type="text" pattern=".+"
					required="" placeholder="Filename" path="filename" />
				<Label>Filename</Label>
			</div>
			<div class="cascade">
				<div class="form-group" id="consumer-group">
					<div class="field">
						<form:input class="form-control" type="text" pattern=".+"
							required="" placeholder="Consumer" path="consumerName" />
						<Label>Consumer</Label>
					</div>
					<div class="field">
						<form:select class="form-control" path="protocolIdFk"
							required="true" itemValues="id">
							<form:option value="${null}" label="-- Select Protocol --">
							</form:option>
							<c:forEach var="protocol" items="${listProtocolName}">
								<form:option value="${protocol.id}">${protocol.name}</form:option>
							</c:forEach>
						</form:select>
					</div>
									<button style="float: right" type="submit" class="btn icon save">Submit</button>
					
				</div>

<!-- 				<div class="cascade"> -->
<!-- 					<div class="form-group" id="property-group"> -->
<!-- 						<div class="form-group" id="property-new"></div> -->
<!-- 					</div> -->
<!-- 				</div> -->
			</div>

		</div>
		<!-- end outer cascade -->

	</form:form>
	<%@ include file="WEB-INF/common/footer.jsp"%>
</div>
</body>
</html>