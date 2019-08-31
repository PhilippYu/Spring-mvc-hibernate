<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30.08.2019
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Welcome, Enter The student Details</h3>
<h1>Add student</h1>
<spring:form method="post" modelAttribute="studentFromServer" action="/app/student/add">
    <spring:input path="name"/>
    <spring:button>Add student</spring:button>
</spring:form>
</body>
</html>
