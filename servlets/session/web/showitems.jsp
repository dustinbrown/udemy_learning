<%@ page import="demo.Cart" %><%--
  Created by IntelliJ IDEA.
  User: dbrown
  Date: 1/9/16
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart");%>
Items in cart: <%= cart == null ? "error" : cart.getTotalItems() %>
<!-- IMPORTANT
use encode url to allow users to disable cookies
Using encode url will add jsessionid to the url to keep track of the session -->
<a href="<%= response.encodeURL(request.getContextPath() + "/showcart2.jsp")%>">Click here to go to showcart2</a>
</body>
</html>
