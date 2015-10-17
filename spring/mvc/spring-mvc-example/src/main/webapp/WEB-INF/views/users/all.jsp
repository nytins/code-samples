<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
<title>All Users</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>Full Name</th>
			<th>Email</th>
			<th>Edit</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user" items="${allUsers}">
		<tr>
			<td>${user.id}</td>
			<td>${user.fullName}</td>
			<td>${user.email}</td>
			<td><a href="${pageContext.request.contextPath}/users/${user.id}?edit">Edit</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<div class="button">
	<a href="?new">New User</a>
</div>

</body>
</html>