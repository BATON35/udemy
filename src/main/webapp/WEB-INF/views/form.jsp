<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 20.06.2018
  Time: 01:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${gender}
    <%=request.getParameter("studentName")%><%--scriplet--%>
</h1>
Name: ${param.studentName}<%--expression language --%>
${name}

<ul>
</ul>
</body>
</html>


