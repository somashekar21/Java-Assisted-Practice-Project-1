<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home</title>
<style>
.header {
text-align: center;
margin-bottom: 20px;
}
.link {
display: block;
margin-bottom: 10px;
}
</style>
</head>
<body>
<h2>User Home</h2>
<a class="link" href="userhome.jsp">Home</a>
<a class="link" href="search.jsp">Search Crossing</a>
<a class="link" href="favorite.jsp">Favorite Crossing</a>
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/railway" user="root" password="shekar@123" />
<sql:query dataSource="${snapshot}" var="result"> SELECT * 
FROM adminhome;
</sql:query>
<c:forEach var="row" items="${result.rows}"> <div>
<h4>Name: <c:out value="${row.Name}" /></h4>
<p>Address: <c:out value="${row.Address}" /></p>
<p>Landmark: <c:out value="${row.Landmark}" /></p>
<p>Time Schedule: <c:out value="${row.Trainschedule}" /></p>
<p>Person In-Charge: <c:out value="${row.pname}" /></p>
<p>Status: <c:out value="${row.status}" /></p> <form
action="AddToFavorite" method="POST">
<input type="hidden" name="itemId" value="${row.id}" />
<input type="submit" value="Add to Favorite" />
</form>
</div>
<hr />
</c:forEach>
<a class="link" href="login.jsp">Logot</a>
</body>
</html>
