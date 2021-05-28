<%--
  Created by IntelliJ IDEA.
  User: jakechadwell
  Date: 5/28/21
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="partials/head.jsp"%>
    <title>Guessing</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
    <div class="container">
        <h1>Please Guess a Number Between 1 and 3.</h1>
        <form action="/guess" method="POST">
            <div class="form-group">
                <label for="number">Enter a number: </label>
                <input id="number" name="number" class="form-control" type="number">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Submit">
        </form>
    </div>

</body>
</html>
