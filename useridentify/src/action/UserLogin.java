package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.dao.DaoUserCon;
import db.entity.User;

@WebServlet("/user")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/htmp;charset:utf-8");

		DaoUserCon daoUserCon = new DaoUserCon();
		List<User> lists = null;
		try {
			lists = daoUserCon.queryUserCon(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean bFind = false;
		for(int i = 0; null != lists && i<lists.size(); i++) {
			User u = lists.get(i);
			if (pwd != null && u.getPassword().equals(pwd)) {
				bFind = true;
				System.out.println("获取到用户名和密码");
				break;
			}
		}
		
		if(!bFind) {
			System.out.println("没有匹配的用户名和密码:" + user+":"+pwd);
		}
		
		// 用户验证
		if(bFind) {
			
			HttpSession hs = request.getSession();
			hs.setAttribute("user_session", "user_session");
			//hs.invalidate();
			//request.setAttribute("user", user);
			hs.setAttribute("user", user);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "登录失败");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
