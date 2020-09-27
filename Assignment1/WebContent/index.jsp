<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--question 1 -->
	<h1>hello world</h1>

	<%
		out.print("welcome to jsp");
	%><br>
	<!-- question 2 -->
	<%@ page import="java.util.Date"%>
	<%=new Date()%>
	<br>
	<!-- question 3  -->
	<%!String name = "lai tuan dat";%>
	<%="hello " + name%><br>
	<!-- question 4 -->
	<%=java.util.Calendar.getInstance().getTime()%>
	<br>
	<!-- question 5 -->
	<form action="Welcome.jsp">
		<input type="text" name="name"> <input type="submit"
			value="send">
	</form>
	<br>
	<!-- question 6 -->
	<%@ page errorPage="error.jsp"%>
	<%
		String a = "5";
	int b = Integer.parseInt(a);
	%>
	<br>
	<!-- exercise 2 -->
	<!-- question 1 , 2 -->
	<form action="ketqua.jsp">
		so 1 <input type="number" name="a"><br> so 2 <input
			type="number" name="b"><br> <input type="submit"
			name="pt" value="+"> <input type="submit" name="pt" value="-">
		<input type="submit" name="pt" value="*"> <input type="submit"
			name="pt" value="/">
	</form>

	<!-- question 3,4 -->
	<style>
table, th, td {
	border: 1px solid black;
}
</style>
	<table style="width: 100%">
		<tr>
			<th>stt</th>
			<th>ten vxl</th>
			<th>hang sx</th>
			<th>ngay ra mat</th>
			<th>gia</th>
		</tr>

	</table>


</body>
</html>