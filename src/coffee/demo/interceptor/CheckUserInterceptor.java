package coffee.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.HandlerInterceptor;

public class CheckUserInterceptor implements HandlerInterceptor {

	//在访问handler（controller的方法）处理之前做拦截（常用）
	//返回值true  表示通行  false 表示拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("CheckUserInterceptor:调用preHandle()");
		
	//先判断访问路径是否包含login
		String path=request.getRequestURI();
		if(path.indexOf("login")>0) {
			return true;
		}

		//在session中获取用户对象
		HttpSession session=request.getSession();
		if(session.getAttribute("user")!=null) {//已登录
			return true;
		}else {//没有登录
			response.sendRedirect(request.getContextPath()+"/html/login.jsp");
			return false;
		}
	}

	//在访问完handler方法后拦截，其返回值ModelAndView后调用
	@Override  
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			org.springframework.web.servlet.ModelAndView mv) throws Exception {
		System.out.println("CheckUserInterceptor:调用postHandle()");
		
		
		
	}
	
	
	//在handler方法完全调用后
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception e)
			throws Exception {
		System.out.println("CheckUserInterceptor:调用afterCompletion()");
		
	}

	
	

}
