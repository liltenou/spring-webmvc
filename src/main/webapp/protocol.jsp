<%@ include file="WEB-INF/common/header.jsp" %>
<!-- add new protocol and friendly name -->

	<div class="container">
		<!--  page header -->
		<div class=page-header>
			<h2>Create a new protocol</h2>
		</div>
		<div>
			<p>
				The protocol created here will be added to the protocol dropdown
				list. Remember to go to the <a href="${pageContext.request.contextPath}/parameter/add">Add
					Parameters to Protocol Page</a> to add Protocol parameters
			</p>
		</div>
		<!-- protocol  info -->
		<c:if test="${saved == 'success'}">
			<p class="success">User Created Successfully</p>
		</c:if>
		<c:if test="${deleted == 'success'}">
			<p class="success">User Deleted Successfully</p>
		</c:if>
		<c:if test="${status == 'exist'}">
			<p class="error">User Already Exist</p>
		</c:if>

		<form:form method="post" command="name"
			action="${pageContext.request.contextPath}/protocol/add/process">
			<div class="form-group">
				<div class="field">
					<input class="form-control" type="text" pattern=".+" required
						placeholder="Enter Protocol" path="protocol" name="protocol" /> <Label>Protocol</Label>
				</div>
				<div class="field">
					<input class="form-control" type="text" pattern=".+" required
						placeholder="Protocol Suite Name" path="name" name="name" /> <Label>Protocol
						Suite Name</Label>
				</div>
			</div>

			<button style="float: right" type="Submit" id="save"
				class="btn icon save">Submit</button>
		</form:form>
	</div>
	<!-- <script type="text/javascript"> -->

	<!-- // 	$(function() { -->
	<!-- // 		$("#save").click(function(event) { -->
	<!-- //         	$("#user").attr("action", "/spring-webmvc/create") -->
	<!-- // 			$("#user").submit(); -->
	<!-- // 		}); -->
	<!-- // 	}); -->
	<!-- <!-- </script> -->
</body>
</html>