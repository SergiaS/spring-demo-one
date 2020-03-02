<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>
    Hello world of Spring!

    <br><br>

    Student name: ${param.studentName}

    <br><br>

    The message : ${message}


    <img src="${pageContext.request.contextPath}/resources/pictures/tests/screen1.png" width="20" height="20">
</body>
</html>
