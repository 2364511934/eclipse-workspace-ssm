package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.UserService;
import service.impl.UserServiceImpl;
import sun.print.resources.serviceui;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String method = request.getParameter("method");
		
		//从application域中获取spring容器
		WebApplicationContext wac = (WebApplicationContext) request.getServletContext()
			.getAttribute(
				WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		
		//WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		
		UserService service = wac.getBean("userservice",UserService.class);
		
		if("add".equals(method)){//添加
			service.addUser();
		}
		
		if("del".equals(method)){//删除
			service.deleteUser();
		}
	}

}
