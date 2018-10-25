<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/25/2018
  Time: 8:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Email Validation</title>
  </head>
  <body>
  <h1>Email validator</h1>
  <form method="post">
    <input type="text" name="email">
    <input type="submit" value="Validate">
  </form>
  </body>
</html>
