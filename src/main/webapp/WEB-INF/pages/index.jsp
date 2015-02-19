<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script type="text/javascript"
        src="<c:url value="/resources/js/jquery-2.1.3.min.js" />">
</script>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div>
    <f:form commandName="userEntity">
        <f:input path="userName"/>
        <f:input path="password"/>
        <f:input path="userDetail.id"/>
        <f:input path="userDetail.firstName"/>
    </f:form>
</div>
<script type="text/javascript">
    function handleClick(clickedId) {
        alert(document.getElementById("abc").value);
    }
</script>
<script type="text/javascript">
    $("button[name$='saveBtn']")
            .click(
            function () {
                $('[name="registerForm"]')
                        .attr('action',
                        "${pageContext.request.contextPath}/register/${userEntity.userId}");
                $('[name="registerForm"]').submit();
            });
    $("button[name$='updateBtn']")
            .click(
            function () {
                $('[name="registerForm"]')
                        .attr('action',
                        "${pageContext.request.contextPath}/update/${userEntity.userId}");
                $('[name="registerForm"]').submit();
            });
    $("button[name$='deleteBtn']")
            .click(
            function () {
                $('[name="registerForm"]')
                        .attr('action',
                        "${pageContext.request.contextPath}/delete/${userEntity.userId}");
                $('[name="registerForm"]').submit();
            });
</script>