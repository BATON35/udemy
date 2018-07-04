<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 29.06.2018
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%--<title>studentForm</title>--%>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name;
    <form:input path="name"/>
    <br><br>

    Surname name;
    <form:input path="surname"/>
    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${student.countries}"/>
    </form:select>
    <br><br>

    Sex:    <from:radiobuttons path="sex" items="${student.sexes}"/>
    <%--Women<from:radiobutton path="sex" value="Women"/>--%>
    <br><br>

    Operating systems:
    <form:checkboxes path="system" items="${student.systems}"/>
    <br>
    <input type="submit" value="Send">
</form:form>
</body>
</html>
