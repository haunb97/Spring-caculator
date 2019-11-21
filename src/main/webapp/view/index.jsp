<%--
  Created by IntelliJ IDEA.
  User: haunq
  Date: 11/21/2019
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
<h1>Caculator</h1>
  <form action="/caculator" method="post">
      <input type="text" name="num1">
      <input type="text" name="num2">
      <input type="submit" value="Addtion(+)" name="operator">
      <input type="submit" value="Subtraction(-)" name="operator">
      <input type="submit" value="Mutip(*)" name="operator">
      <input type="submit" value="Division(/)" name="operator">
    <h1>${model}</h1>
  </form>
  </body>
</html>
