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
<!-- application is for the entire app, only cleared by app restart -->
<jsp:useBean id="user4" class = "beans.User" scope="application"></jsp:useBean>
<jsp:setProperty name="user4" property="email" value="dustinjamesbrown@gmail.com"/>
<jsp:setProperty name="user4" property="password" value="letmein"/>

<!-- Using jsp forward, this is still only treated as one request from the browser -->
</body>
</html>
