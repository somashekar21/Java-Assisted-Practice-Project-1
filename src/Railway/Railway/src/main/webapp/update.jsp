<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Update Railway Crossing</title> </head>
<body>
<h2>Update Railway Crossing</h2>
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/railway" user="root" password=”shekar@123" />
<c:if test="${not empty param.id}">
<sql:query dataSource="${snapshot}" var="result"> SELECT * FROM 
adminhome WHERE id = ?
<sql:param value="${param.id}" />
</sql:query>
<c:if test="${not empty result.rows}">
<c:forEach var="row" items="${result.rows}">
<form action="updateProcess.jsp" method="POST">
<input type="hidden" name="id" value="${row.id}" />
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="Name" value="${row.Name}" required></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="Address" value="${row.Address}" required></td> </tr>
<tr>
<td>Landmark:</td>
<td><input type="text" name="Landmark" value="${row.Landmark}"
required></td>
</tr>
<tr>
<td>Time Schedule:</td>
<td><input type="time" name="Trainschedule" value="${row.Trainschedule}" required></td>
</tr>
<tr>
<td>Person In-Charge:</td>
<td><input type="text" name="pname" value="${row.pname}" required></td>
</tr>
<tr>
<td>Status:</td>
<td>
<input type="radio" name="status" value="open" ${row.status == 'open' ? 'checked' : ''}
required> Open
<input type="radio" name="status" value="closed" ${row.status == 'closed' ? 'checked' : ''}
required> Closed
</td>
</tr>
<tr>
<td><input type="submit" value="Update Crossing"></td>
</tr>
</table>
</form>
</c:forEach>
</c:if>
</c:if>
</body>
</html>
