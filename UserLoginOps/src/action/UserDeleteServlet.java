package action;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;

/**
 * Servlet implementation class UserDelete
 */
@WebServlet("/delete")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 接收用户数据
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");


		UserDao userDao = new UserDao();
		int rows = userDao.DeleteOneUser(user, pwd);
		// 有用户数据
		if (rows > 0) {
			//request.setAttribute("delete", "删除成功");
			request.setAttribute("del", user);
			// request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("afterdelete.jsp").forward(request, response);

		} else {
			request.setAttribute("delete", "删除失败");
			request.getRequestDispatcher("delete.jsp").forward(request, response);
		}

	}

}
