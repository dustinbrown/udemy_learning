<%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/6/16
  Time: 1:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world jsp</title>
</head>
<body>
jsp!
<%@ page import="java.util.Date, gui.*" %>
<%@ page import="java.io.PrintWriter" %>
<%--<%
String text = "dustin";
   PrintWriter outt = new PrintWriter();
    outt.println(new Date());

%>--%>
<%= new Date() %>
<%
    InsideClass me = new InsideClass();
    out.println(me.getInfo());
%>
</body>
</html>
