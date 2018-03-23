<%@page import="bean.User"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	if (null == request.getSession().getAttribute("user")) {
%>
<jsp:forward page="login.jsp"></jsp:forward>
<%
	}
%>

<%
	List<User> users = (List<User>) request.getSession().getAttribute("users");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 欢迎您<%=request.getSession().getAttribute("user")%> --%>
	<table border="1" cellspacing="0" cellpadding="0" width="300px" height="15px">
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td>密码</td>
			<td>日期</td>
		</tr>
		<%
			for (int i = 0; i < users.size(); i++) {
				/* Book b = books.get(i);
				request.setAttribute("book", b); */
				request.setAttribute("i", i);
		%>
			<tr>
				<%-- <td>${book.bid}</td>
				<td>${book.bname}</td>
				<td>${book.author}</td>
				<td>${book.price}</td> --%>
				<td>${users[i].user_id}</td>
				<td>${users[i].user_name}</td>
				<td>${users[i].user_password}</td>
				<td>${users[i].user_date}</td>
			</tr>
			<% }
		%>
	</table>
	欢迎您<%=request.getSession().getAttribute("user")%>
	<a href="logout.jsp">注销</a>
</body>
</html>