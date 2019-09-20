<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 19/09/2019
  Time: 10:57 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<em>Fill out the form. Asterisk (*) means required </em>
<br><br>
<form:form action="showForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>

    <br><br>
    Last name(*): <form:input path="lastName" cssClass="error"/>

    <br><br>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
