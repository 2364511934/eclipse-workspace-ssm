<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    HttpSession hs = request.getSession();
	if(null != hs.getAttribute("user_session")){
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="session" method="get">
		用户名:<input type="text" name="user"/><br/>
		密码:<input type="password" name="pwd"/><br/>
		<input type="submit" value="登录"/><%=(request.getAttribute("msg") == null ? "":request.getAttribute("msg"))%>
	</form>
</body>
</html>