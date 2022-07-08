<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>paramMultiply</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>x</th>
        <c:forEach begin="1" end="${cols}" var="i">
            <th>${i}</th>
        </c:forEach>
    </tr>
    </thead>
    <tbody>
    <c:forEach begin="1" end="${rows}" var="i">
        <tr>
            <td>${i}</td>
            <c:forEach begin="1" end="${cols}" var="j">
                <td>${i*j}</td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>