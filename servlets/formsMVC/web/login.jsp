<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/9/16
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/controller" method="post">
    <input type="hidden" name="action" value="dologin"/>
    Email: <input type="text" name="email" value="<%= request.getAttribute("email") %>"/>
    Password: <input type="text" name="password" value=""/>
    <input type="submit" value="OK"/>
</form>

<h2>
    <%= request.getAttribute("validationMessage")%>
</h2>
</body>
</html>
