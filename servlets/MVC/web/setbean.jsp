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
<jsp:useBean id="user" class = "beans.User" scope="session"></jsp:useBean>
<jsp:setProperty name="user" property="email" value="dustinjamesbrown@gmail.com"/>
<jsp:setProperty name="user" property="password" value="letmein"/>
</body>
</html>

