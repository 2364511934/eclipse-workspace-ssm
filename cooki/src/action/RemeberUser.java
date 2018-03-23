package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemeberUser
 */
@WebServlet("/reuser")
public class RemeberUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		Cookie cookiUser = new Cookie("user", user);
		Cookie cookiPwd = new Cookie("pwd", pwd);
		
		response.addCookie(cookiUser);
		response.addCookie(cookiPwd);
		System.out.println("创建了二个cooki");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/htmp;charset:utf-8");
		response.getWriter().println("登录成功");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
