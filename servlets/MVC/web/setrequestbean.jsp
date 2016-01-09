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
<!-- request is for a single browser request -->
<jsp:useBean id="user3" class = "beans.User" scope="request"></jsp:useBean>
<jsp:setProperty name="user3" property="email" value="dustinjamesbrown@gmail.com"/>
<jsp:setProperty name="user3" property="password" value="letmein"/>

<!-- Using jsp forward, this is still only treated as one request from the browser -->
<jsp:forward page="getrequestbean.jsp"/>

</body>
</html>
