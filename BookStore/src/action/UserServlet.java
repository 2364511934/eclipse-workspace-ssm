package action;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.���ñ���
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 2. �����û�����
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		
		// 3. У���û����� ���� UserDao
		UserDao userDao = new UserDao();
		int rows = userDao.QueryOne(user, pwd);
		// ���û�����
		if(rows> 0) {
			System.out.println("��ȡ���û�����");
			// ��¼�û����� ���ڼ�¼�û���
			request.getSession().setAttribute("user", user);
			//request.setAttribute("msg", "��¼�ɹ�");
			request.getRequestDispatcher("book").forward(request, response);
		}
		else {
			System.out.println("û�л�ȡ���û�����");
			request.setAttribute("msg", "��¼ʧ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		   
		
	}

}