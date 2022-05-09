<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ prefix="c" taglib uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
table {
float: left;
}

table, th, td {
border: 1px solid black;
}
</style>
<head></head>
<body>
	<h2>Users Page</h2>
	<table>
	<tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		<c:forEach items="${users}" var="user" varStatus="count">
			<tr id="${count.index}">
			<td>${specialUsers.id}</td>
			<td>${specialUsers.name}</td>
			<td>${specialUsers.email}</td>
			<td>${specialUsers.password}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> 