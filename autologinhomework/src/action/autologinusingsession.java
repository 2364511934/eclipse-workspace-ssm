package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class autologinusingsession
 */
@WebServlet("/session")
public class autologinusingsession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/htmp;charset:utf-8");

		// 用户验证
		if (user != null && pwd != null && "zs".equals(user) && "123".equals(pwd)) {

			HttpSession hs = request.getSession();
			hs.setAttribute("user_session", "user_session");
			// hs.invalidate();
			// request.setAttribute("user", user);
			hs.setAttribute("user", user);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "登录失败");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		// response.getWriter().println("登录成功");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
