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

		// �����û�����
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		// 3. У���û����� ���� UserDao
		UserDao userDao = new UserDao();
		int rows = userDao.QueryOne(user, pwd);
		// ���û�����
		if (rows > 0) {
			// ��ѯ�����û���Ϣ
			// ��¼�û����� ���ڼ�¼�û���
			request.getSession().setAttribute("user", user);
			//request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("query").forward(request, response);
			
		} else {
			request.setAttribute("msg", "��¼ʧ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
