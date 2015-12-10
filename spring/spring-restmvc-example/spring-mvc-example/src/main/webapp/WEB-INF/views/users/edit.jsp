<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
<title>New User</title>
</head>
<body>

<sf:form modelAttribute="user" method="POST">
<table>
	<tr>
		<th>ID:</th>
		<td><sf:input path="id" /> <sf:errors path="id" cssClass="error"/></td>
	</tr>
	<tr>
		<th>Name:</th>
		<td><sf:input path="name" /> <sf:errors path="name" cssClass="error"/></td>
	</tr>
	<tr>
		<th>Email:</th>
		<td><sf:input path="email" /> <sf:errors path="email" cssClass="error"/></td>
	</tr>
</table>
<input type="submit" value="Submit"/>
</sf:form>

</body>
</html>