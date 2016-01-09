<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user5" class="beans.User" scope="page"/>
<%-- if no value or param, you can set it via the property. ie URL/URI?password=blah
     You could also use a * that will take any param and set it --%>
<jsp:setProperty name="user5" property="password" param="p"/>

<%= user5.getPassword()%>
</body>
</html>
