package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;

/**
 * Servlet implementation class UserQueryServlet
 */
@WebServlet("/query")
public class UserQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取全部用户信息
		UserDao userDao = new UserDao();
		List<User> lists = userDao.QueryAll();
		
		request.getSession().setAttribute("users", lists);
		//request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

}
