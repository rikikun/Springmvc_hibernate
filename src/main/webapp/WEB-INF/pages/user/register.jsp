<%--
  Created by IntelliJ IDEA.
  User: rikikun
  Date: 2/14/2015
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<div class="container">



	<div class="container">
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="progress">
						<div class="progress-bar" role="progressbar" aria-valuenow="40"
							aria-valuemin="0" aria-valuemax="100" style="width: 100%;">40%</div>
					</div>
				</div>
				<div class="panel-body">

					<f:form commandName="userEntity" action="${contextPath}/register"
						method="post">




						<div class="control-group">
							<label class="control-label" for="userName">Username</label>
							<div class="controls">
								<f:input path="userName" placeholder="placeholder" />
								<f:errors path="userName" cssClass="alert-danger" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="password">Password</label>
							<div class="controls">
								<f:password path="password" placeholder="placeholder"/>
								<f:errors path="password" cssClass="alert-danger" />
							</div>
						</div>
						<input type="submit" value="Submit" />
					</f:form>
				</div>
			</div>
		</div>
	</div>

</div>