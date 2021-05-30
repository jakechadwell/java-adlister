<%--
  Created by IntelliJ IDEA.
  User: jakechadwell
  Date: 5/30/21
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PizzaOrder</title>
</head>
<body>
<form action="/pizza.jsp" method="post">
    <div>
        <label for="crust-type">Choose a Crust Type</label>
        <select id="crust-type">
            <option>Thin Crust</option>
            <option>Regular Crust</option>
            <option>Stuffed Crust</option>
        </select>
    </div>
    <div>
        <label for="sauce-type">Choose a Sauce Type</label>
        <select id="sauce-type">
            <option>White Sauce</option>
            <option>Red Sauce</option>
            <option>No Sauce</option>
        </select>
    </div>
    <div>
        <label for="size-type">Choose a Sauce Type</label>
        <select id="size-type">
            <option>Small</option>
            <option>Medium</option>
            <option>Large</option>
        </select>
    </div>
    <div>
        <input type="checkbox" value="pepperoni" id="pepperoni">
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" value="beef" id="beef">
        <label for="beef">Beef</label>
        <input type="checkbox" value="sausage" id="sausage">
        <label for="sausage">Sausage</label>
        <input type="checkbox" value="pineapple" id="pineapple">
        <label for="pineapple">Pineapple</label>
        <input type="checkbox" value="ham" id="ham">
        <label for="ham">Ham</label>
    </div>
    <div>
        <input type="text" id="address" placeholder="Example: 123 Cherry Street, 12312">
        <label for="address">Enter Address: </label>
    </div>
    <input type="submit" class="btn btn-block" value="Enter">
</form>


</body>
</html>
