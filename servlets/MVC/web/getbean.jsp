<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class = "mvcBeans.User" scope="session"></jsp:useBean>
Email: <%= user.getEmail()%>
<br/>
Password: <%= user.getPassword()%>
</body>
</html>
