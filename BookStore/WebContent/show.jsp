<%@page import="bean.Book"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<Book> books = (List<Book>) request.getSession().getAttribute("books");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 欢迎您<%=request.getSession().getAttribute("user")%> --%>
	<table border="1" cellspacing="0" cellpadding="0" width="230" height="15">
		<tr>
			<td>序号</td>
			<td>书名</td>
			<td>作者</td>
			<td>价格</td>
		</tr>
		<%
			for (int i = 0; i < books.size(); i++) {
		%>
			<tr>
				<td><%=books.get(i).getBid()%></td>
				<td><%=books.get(i).getBname()%></td>
				<td><%=books.get(i).getAuthor()%></td>
				<td><%=books.get(i).getPrice()%></td>
			</tr>
			<% }
		%>
	</table>
</body>
</html>