<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/9/16
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user1" class="beans.User" scope="session"/>
<jsp:setProperty name="user1" property="*"/>
<%
    String action = request.getParameter("action");
    if (action != null && action.equals("formsubmit")) {
        if (user1.validate()) {
            request.getRequestDispatcher("/controller").forward(request, response);
        }
    }
%>

<h2>
    <jsp:getProperty name="user1" property="message"/>
</h2>

<form action="/selfvalidatingform.jsp" method="post">
    <input type="hidden" name="action" value="formsubmit"/>
    <input type="text" name="email" value="<jsp:getProperty name="user1" property="email"/>"/>
    <br/>
    <input type="text" name="password" value="<jsp:getProperty name="user1" property="password"/>"/>
    <input type="submit" value="ok"/>

</body>
</html>
