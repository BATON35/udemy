<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 05.07.2018
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmation page for customer</title>
</head>
<body>
Name: ${customer.firstName}
<br>
Surname: ${customer.lastName}
<br>
You toke: ${customer.freePasses} free passes
<br>
Postal code: ${customer.postalCode}

</body>
</html>
