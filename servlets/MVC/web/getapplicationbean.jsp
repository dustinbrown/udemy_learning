<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user4" class = "beans.User" scope="application"></jsp:useBean>
Email: <%= user4.getEmail()%>
<br/>
Password: <%= user4.getPassword()%>

</body>
</html>
