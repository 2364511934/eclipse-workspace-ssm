package action;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet1 implements Servlet {
	// ���췽��
	public HelloServlet1() {
		System.out.println("���췽����ʼ��");
	}
	// ��ʼ��
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("��ʼ������");
	}
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("��ȡ�����ļ�");
		return null;
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("��������ҵ��service ");
	}
	@Override
	public String getServletInfo() {
		System.out.println("��ȡ��Ϣ");
		return null;
	}
	@Override
	public void destroy() {
		System.out.println("������Դ");
	}

}
