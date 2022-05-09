<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
<html>
<style>
table {
	float: left;
}

th {
	border-bottom: 1px solid black;
	text-align: left;
}
</style>
<body>

	<h2>Search for User</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${searchSpecialUser.userId}</td>
			<td>${searchSpecialUser.name}</td>
			<td>${searchSpecialUser.email}</td>
			<td>${searchSpecialUser.password}</td>
		</tr>
	</table>

	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<form:form action="update" method="post" commandName="update">
		<h3>Update This User?</h3>
			<p>User ID: ${searchSpecialUser.id}</p>
			<input type="hidden" name="userId" id="userId" value="${searchSpecialUser.userId}" required/>
			<label for="name">New Name:</label><br/>
			<input type="text" name="name" id="name" value="${searchSpecialUser.name}" required/><br/>
			<label for="email">New Email:</label> <br/>
			<input type="text" name="email" id="email" value="${searchSpecialUser.email}" required/><br/>
			<label for="password">New Password:</label><br/>
			<input type="text" name="password" id="password" value="${searchSpecialUser.password}" required/><br/><br/>
			<input type="submit" value="Submit"/>
	</form:form>
	<br />
	<br />
	<a href="/">Return to Menu</a>
</body>
</html>