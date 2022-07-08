<%--
  Created by IntelliJ IDEA.
  User: pablo
  Date: 23/06/2022
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>multiply</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>x</th>
        <c:forEach begin="1" end="${size}" var="i">
            <th>${i}</th>
        </c:forEach>
    </tr>
    </thead>
    <tbody>
    <c:forEach begin="1" end="${size}" var="i">
        <tr>
            <td>${i}</td>
            <c:forEach begin="1" end="${size}" var="j">
                <td>${i*j}</td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>