<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List of Employees</h2>
<table>
    <tr>
        <td>ID</td><td>NAME</td>
    </tr>
    <c:forEach items="${students}" var="st">
        <tr>
            <td>${st.id}</td>
            <td>${st.name}</td>
        </tr>
    </c:forEach>
</table>
<br/>
</body>
</html>
