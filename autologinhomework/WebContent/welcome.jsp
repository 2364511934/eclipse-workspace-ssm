<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    HttpSession hs = request.getSession();
	if(null == hs.getAttribute("user_session")){
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎您<%=request.getSession().getAttribute("user")%> <a href="logout.jsp">注销</a>
</body>
</html>