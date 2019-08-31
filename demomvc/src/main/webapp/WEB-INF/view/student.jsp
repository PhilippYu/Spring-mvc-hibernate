<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List of Employees</h2>
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
    </tr>
    <c:forEach items="${students}" var="st">
        <tr>
            <td>${st.id}</td>
            <td>${st.name}</td>
        </tr>
    </c:forEach>
</table>
<br/>

<h1>Add student</h1>
<form method="post">
    <input name="name" type="text"/>
    <input type="submit"/>
</form>
</body>
</html>
