<%@ include file="WEB-INF/common/header.jsp" %>
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

				<form:form method="POST" commandName="protocols" action="/parameter/add/process">
				<c:forEach var="protocol" items="${protocolName}"></c:forEach>
					<div class="form-group">
						<div class="field">
							<form:select path="protocolIdFk">
							 <form:option value="-" label="-- Select Protocol --">  </form:option>
								<form:options items="${protocolName}" />
							</form:select>


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
								placeholder="Add Parameter" name="parameter" path="name"/> <Label>Description</Label>
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