package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserForm
 */
@WebServlet("/user")
public class UserForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset:utf-8");
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		System.out.println("user:"+user + "pwd:" + pwd);
		
		//response.getWriter().println("<p>³É¹¦</p>");
		request.setAttribute("user", user);
		//request.getRequestDispatcher("welcome.jsp").forward(request, response);
		
		response.sendRedirect("welcome.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post ²Ù×÷");
		doGet(request, response);
	}

}
