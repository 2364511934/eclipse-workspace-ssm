package action;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet1 implements Servlet {
	// 构造方法
	public HelloServlet1() {
		System.out.println("构造方法初始化");
	}
	// 初始化
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化代码");
	}
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("获取配置文件");
		return null;
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("正常处理业务：service ");
	}
	@Override
	public String getServletInfo() {
		System.out.println("获取信息");
		return null;
	}
	@Override
	public void destroy() {
		System.out.println("销毁资源");
	}

}
