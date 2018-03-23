package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 接收用户数据
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		// 3. 校验用户数据 生成 UserDao
		UserDao userDao = new UserDao();
		int rows = userDao.QueryOne(user, pwd);
		// 有用户数据
		if (rows > 0) {
			// 查询所有用户信息
			// 记录用户数据 用于记录用户名
			request.getSession().setAttribute("user", user);
			//request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("query").forward(request, response);
			
		} else {
			request.setAttribute("msg", "登录失败");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
