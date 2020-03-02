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

        Last name: <form:input path="lastName"/>

    </form:form>

</body>
</html>