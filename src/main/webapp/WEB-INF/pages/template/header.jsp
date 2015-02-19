<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<header class="navbar navbar-static-top bs-docs-nav" id="top" role="banner">
</header>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="brand" href="#"><img src="img/aug_intranet_header1.png"
                                           width="130" height="50" alt="augmentis logo"/></a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-left">
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown">Employee <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="initEmployee.action">Add Employee</a></li>
                        <li><a href="listEmployee.action">List Employee</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown">Role & Responsibility <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="initRoleResponsibility.action">Add Role & Responsibility </a></li>
                        <li><a href="listRoleResponsibility.action">List Role & Responsibility </a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown">Department <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="initDepartment.action">Add Department</a></li>
                        <li><a href="listDepartment.action">List Department</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown">Timesheet<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="initTimesheet.action">Add Timesheet</a></li>
                        <li><a href="initTimesheet.action">Show Timesheet</a></li>
                    </ul>
                </li>


            </ul>
            <c:if test="${not empty pageContext.request.userPrincipal}">

                <ul class="nav navbar-nav navbar-right">
                    <li> <a href="#">User: <c:out value="${pageContext.request.userPrincipal.name}" /></a></li>
                    <li><a href="j_spring_security_logout">Log Out</a></li>
                </ul>
            </c:if>
            <c:if test="${empty pageContext.request.userPrincipal}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${contextPath}/register">Sign Up</a></li>
                </ul>
            </c:if>

        </div>
    </div>
</div>