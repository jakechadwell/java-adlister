<%--
  Created by IntelliJ IDEA.
  User: jakechadwell
  Date: 6/1/21
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Index"/>
    </jsp:include>
    <style>
        .ad{
            border: 2px solid darkgray;
            margin: 2em;
            padding: 5px;
            background-color: white;
        }
        body{
            background-color: dimgrey;
        }
    </style>
</head>
<body>
    <jsp:include page="/partials/navbar.jsp"/>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</body>
</html>
