<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 24.10.2017
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Редактирование</title>
</head>
<body>
<h3>Редактирование</h3>
<form method="post" action="Red">
    <label>Id</label><br>
    <input value="${zakaz.idzakaz}" name="id" /><br><br>
    <label>Name</label><br>
    <input name="name" value="${zakaz.name}" /><br><br>
    <label>Description</label><br>
    <input name="description" value="${zakaz.description}"/><br><br>
    <label>Email</label><br>
    <input name="email" value="${zakaz.email}"/><br><br>
    <input type="submit" value="Редактировать" />
</form>
</body>
</html>