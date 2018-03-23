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
 * Servlet implementation class UserInsert
 */
@WebServlet("/insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收用户数据
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		
		// 3. 校验用户数据 生成 UserDao
		User u = new User();
		u.setUser_name(user);
		u.setUser_password(pwd);
		java.util.Date date = new java.util.Date();
		u.setUser_date(new Date(date.getTime()));
		
		/*java.util.Date d = new java.util.Date();
		
		System.out.println(d.getTime());
		Date date = new Date(d.getTime());
		System.out.println(date);*/
		
		UserDao userDao = new UserDao();
		int rows = userDao.InsertOneUser(u);
		// 有用户数据
		if (rows > 0) {
			// 查询所有用户信息
			// 记录用户数据 用于记录用户名
			request.setAttribute("info", "注册成功");
			request.setAttribute("new", user);
			// request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);

		} else {
			request.setAttribute("info", "注册失败");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}

	}

}
