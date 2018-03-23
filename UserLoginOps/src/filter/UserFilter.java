package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserFilter implements Filter{

	//初始化
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String charset = filterConfig.getInitParameter("charset");
		System.out.println(charset);
	}

	//过滤请求和响应
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		chain.doFilter(request, response);
		
	}

	//销毁
	@Override
	public void destroy() {
		
	}

}
