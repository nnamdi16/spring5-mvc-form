<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 20/09/2019
  Time: 8:40 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Confirmation</title>

</head>
<body>
The customer is confirmed : ${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}

<br><br>
Postal code: ${customer.postalCode}
</body>
</html>
