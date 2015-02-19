<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet"
          href="<c:url value="/resources/css/bootstrap-3.3.2-dist/css/bootstrap.min.css" />">
</head>
<body>
<div class="container">
    <!-- Header -->
    <div class="row">
        <div class="col-md-12">
            <tiles:insertAttribute name="header"/>
        </div>
    </div>
    <div class="row">
        <div class="bs-docs-header">
            <div class="container">
                <h1>Hi</h1>
            </div>
        </div>
    </div>

    <!-- Body -->
    <div class="row">
        <div class="col-md-10 col-md-offset-1">
            <tiles:insertAttribute name="body"/>
        </div>
    </div>

    <!-- Footer -->
    <div class="row">
        <div class="col-md-12">
            <tiles:insertAttribute name="footer"/>
        </div>
    </div>

</div>
<script src="<c:url value="/resources/js/jquery-2.1.3.min.js"/>"></script>
<script
        src="<c:url value="/resources/css/bootstrap-3.3.2-dist/js/bootstrap.min.js"/>"></script>
</body>
</html>
