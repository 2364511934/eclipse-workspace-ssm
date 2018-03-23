<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user ="";
		String pwd = "";
		Cookie[] cookiArr = request.getCookies();
		for(int i=0; cookiArr != null && i<cookiArr.length; i++ ){
			if("user".equals(cookiArr[i].getName())){
				user =cookiArr[i].getValue();
			}
			
			if("pwd".equals(cookiArr[i].getName())){
				pwd= cookiArr[i].getValue();
			}
		}
	%>
	<form action="reuser" method="get">
		用户名:<input type="text" name="user" value="<%=user%>"/><br/>
		密码:<input type="password" name="pwd" value="<%=pwd%>"/><br/>
		<input type="submit" value="register"/>
	</form>
</body>
</html>