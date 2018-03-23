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

		// �����û�����
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");


		UserDao userDao = new UserDao();
		int rows = userDao.DeleteOneUser(user, pwd);
		// ���û�����
		if (rows > 0) {
			//request.setAttribute("delete", "ɾ���ɹ�");
			request.setAttribute("del", user);
			// request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("afterdelete.jsp").forward(request, response);

		} else {
			request.setAttribute("delete", "ɾ��ʧ��");
			request.getRequestDispatcher("delete.jsp").forward(request, response);
		}

	}

}
