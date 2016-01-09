<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user3" class = "mvcBeans.User" scope="request"></jsp:useBean>
Email: <%= user3.getEmail()%>
<br/>
Password: <%= user3.getPassword()%>
</body>
</html>
