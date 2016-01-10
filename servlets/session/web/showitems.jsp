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
Items in cart: <%= cart.getTotalItems() %>
</body>
</html>
