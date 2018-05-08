<%@ tag body-content="scriptless" %>
<%@ attribute name="title" required="true" type="java.lang.String" %>
<!DOCTYPE html>
<html lang="tr">
<head>
	<title>${title}</title>
	<jsp:include page="/WEB-INF/tags/admin/_metadata.jsp"></jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/tags/admin/_menu.jsp"></jsp:include>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
    	<jsp:include page="/WEB-INF/tags/admin/_sidebar.jsp"></jsp:include>
      	<main class="col-md-9 float-left col px-5 pl-md-2 pt-2 main">
        	<a href="#sidebar" data-toggle="collapse"><i class="fa fa-navicon fa-lg"></i></a>
			<jsp:doBody/>
        </main>
      </div>
    </div>
</body>
</html>
