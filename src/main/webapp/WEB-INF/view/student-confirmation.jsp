<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

    The student is comfirmed: ${student.firstName} ${student.lastName}

    <br><br>

    Country: ${student.country}

    <br><br>

    Favorite Language: ${student.favoriteLanguage}

    <br><br>

    Operation System:

    <ul>
        <c:forEach var="temp" items="${student.operationSystems}">
            <li>${temp}</li>
        </c:forEach>

    </ul>
</body>
</html>
