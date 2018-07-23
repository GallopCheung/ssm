<%--
  Created by IntelliJ IDEA.
  User: 张驰
  Date: 2018/7/20
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:if test="${not empty message}">
        <div style="color:orangered">${message}</div>
   </c:if>
    <form method="post" action="" enctype="multipart/form-data">
        <input type="text" name="name"/><br>
        <input type="file" name="file"/><br>
        <input type="submit"/>
    </form>
</body>
</html>
