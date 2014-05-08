<%@ include file="WEB-INF/common/header.jsp"%>
<!-- add new parameters to existing protocol -->

<!-- main page content -->
<div class="container">
	<!--  page header -->
	<div class=page-header>
		<h2>Select Protocol then add it's parameters</h2>
	</div>
	<!--  end page header -->

	<div class="accordion" id="accordion2">
		<div class="accordion-group">

			<form:form method="POST"
				action="${pageContext.request.contextPath}/parameter/add/process">

				<div class="form-group">
					<div class="field">
						<form:select class="form-control" path="protocolIdFk" required="true" itemValues="id">	
								<form:option value="${null}" label="-- Select Protocol --">
								</form:option><c:forEach var="protocol" items="${listProtocolName}">
								<form:option value="${protocol.id}">${protocol.name}</form:option>
							</c:forEach>
						</form:select>
							<%-- 								<form:options items="${protocolId}"/> --%>


						<!-- 							<select class="form-control" path="protocolIdFk"> -->
						<!-- 								<option>Select Protocol</option> -->
						<%-- 								<option>${protocolName}</option> --%>

						<%--  								<options items="${protocols}" itemValue="" itemLabel="">ConnectDirect</options> --%>
						<!-- 								<option>FTP</option> -->
						<!-- 								<option>Mailbox</option> -->
						<!-- 								<option>SFTP</option> -->
						<!-- 							</select> -->
					</div>
					<div class="field">
						<input class="form-control" type="text" pattern=".+" required
							placeholder="Add Parameter" name="name" path="name" /> <Label>Add
							Parameter</Label>
					</div>
					<div class="field">
						<button type="button" class="btn icon save"
							onclick="add_new_parameter();">Save</button>
					</div>
					<div class="field"></div>
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
		</div>
		<!-- end accordion group -->
	</div>
	<!-- end accordion -->
</div>
<!-- end main page content -->
</body>
</html>