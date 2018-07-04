
<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 03.07.2018
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
${student.name} ${student.surname}
<br>
${student.country}
<br>
${student.sex}
<br><br>
Operating system:
<ol>
    <c:forEach var="temp" items="${student.system}">
        <li>${temp}</li>
    </c:forEach>
</ol>
</body>
</html>

