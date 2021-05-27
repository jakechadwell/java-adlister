<%--
  Created by IntelliJ IDEA.
  User: jakechadwell
  Date: 5/27/21
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("password")){
            response.sendRedirect("/profile.jsp");
        }else{
            response.sendRedirect("/login.jsp");
        }
    }
%>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<form action="/login.jsp" method="post">
    <fieldset>
        <div class="form-group">
            <label for="username" class="form-label">Username</label>
            <input type="text" id="username" name="username" class="form-control" placeholder="Enter Username">
        </div>
        <div class="form-group">
            <label for="password" class="form-label">Password</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Enter Password">
        </div>
        <button type="submit" class="btn btn-block">Login</button>
    </fieldset>
</form>

</body>
</html>
