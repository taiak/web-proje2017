<%@ tag body-content="scriptless" %>
<%@ attribute name="title" required="true" type="java.lang.String" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>${title}</title>
	<jsp:include page="/WEB-INF/tags/_metadata.jsp"></jsp:include>
</head>
<body class="animsition">

	<!-- Header -->
    <jsp:include page="/WEB-INF/tags/_header.jsp"></jsp:include>

	<jsp:doBody/>

	<!-- Footer -->
    <jsp:include page="/WEB-INF/tags/_footer.jsp"></jsp:include>
</body>
</html>
