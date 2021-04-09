<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8"  language="java"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Вывод</title>
</head>
<body>
<h2>Список заказов</h2>
<form method="get">
<table>
    <tr><th>Id</th><th>Name</th><th>Description</th><th>Email</th><th></th></tr>
    <c:forEach var="product" items="${products}">
        <tr><td>${product.idzakaz}</td>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.email}</td>
            <td>
            </td></tr>
    </c:forEach>
</table>
Назад <a href="index.jsp">тык</a>
</form>
</body>
</html>