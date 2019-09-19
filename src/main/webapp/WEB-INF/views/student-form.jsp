<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 19/09/2019
  Time: 1:22 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>

        Last Name: <form:input path="lastName"/>
        <br><br>

        <br><br>
        <form:label path="country">Country</form:label>
        <form:select path="country">
            <form:option value="Brazil " label="Brazil"/>
            <form:option value="France " label="France"/>
            <form:option value="Germany" label="Germany"/>
            <form:option value="India" label="India"/>
        </form:select>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
