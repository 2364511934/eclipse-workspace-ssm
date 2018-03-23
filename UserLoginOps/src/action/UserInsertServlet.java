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
		// �����û�����
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		
		// 3. У���û����� ���� UserDao
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
		// ���û�����
		if (rows > 0) {
			// ��ѯ�����û���Ϣ
			// ��¼�û����� ���ڼ�¼�û���
			request.setAttribute("info", "ע��ɹ�");
			request.setAttribute("new", user);
			// request.getRequestDispatcher("show.jsp").forward(request, response);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);

		} else {
			request.setAttribute("info", "ע��ʧ��");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}

	}

}
