<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/9/16
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="beans.User" scope="session"/>
<jsp:setProperty property="*" name="user"/>

<%= user.getEmail()%>
<%= user.getPassword()%>
</body>
</html>
