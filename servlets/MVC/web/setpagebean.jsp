<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user1" class = "beans.User" scope="page"></jsp:useBean>
<jsp:setProperty name="user1" property="email" value="dustinjamesbrown@gmail.com"/>
<jsp:setProperty name="user1" property="password" value="letmein"/>

Email: <%= user1.getEmail()%>
<br/>
Password: <%= user1.getPassword()%>
</body>
</html>
