<%--
  Created by IntelliJ IDEA.
  User: pablo
  Date: 23/06/2022
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Form</title>
</head>
<body>
<form method="post">
    <label>Name</label>
    <input type="text" name="paramName">
    <label>Date</label>
    <input type="date" name="paramDate">
    <button type="submit">Send</button>
</form>
</body>
</html>
