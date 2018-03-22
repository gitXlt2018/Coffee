package coffee.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.HandlerInterceptor;

public class CheckUserInterceptor implements HandlerInterceptor {

	//�ڷ���handler��controller�ķ���������֮ǰ�����أ����ã�
	//����ֵtrue  ��ʾͨ��  false ��ʾ����
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("CheckUserInterceptor:����preHandle()");
		
	//���жϷ���·���Ƿ����login
		String path=request.getRequestURI();
		if(path.indexOf("login")>0) {
			return true;
		}

		//��session�л�ȡ�û�����
		HttpSession session=request.getSession();
		if(session.getAttribute("user")!=null) {//�ѵ�¼
			return true;
		}else {//û�е�¼
			response.sendRedirect(request.getContextPath()+"/html/login.jsp");
			return false;
		}
	}

	//�ڷ�����handler���������أ��䷵��ֵModelAndView�����
	@Override  
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			org.springframework.web.servlet.ModelAndView mv) throws Exception {
		System.out.println("CheckUserInterceptor:����postHandle()");
		
		
		
	}
	
	
	//��handler������ȫ���ú�
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception e)
			throws Exception {
		System.out.println("CheckUserInterceptor:����afterCompletion()");
		
	}

	
	

}
