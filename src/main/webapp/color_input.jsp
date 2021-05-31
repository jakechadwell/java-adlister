<%--
  Created by IntelliJ IDEA.
  User: jakechadwell
  Date: 5/30/21
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form action="/viewcolor" method="post">
        <label for="color">Enter a color</label>
        <input type="text" name="color" id="color">
        <input type="submit" value="Enter">
    </form>
</body>
</html>
