package cn.appsys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.appsys.pojo.Admin_info;
import cn.appsys.pojo.User_info;
import cn.appsys.tools.Constants;


//拦截器判断登录的状态，User_info，Admin_info
//session为空，则跳转到403.jsp，
public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		logger.debug("SysInterceptor preHandle ==========================");
		logger.debug("系统的登录的判断： ==========================");
		HttpSession session = request.getSession();
		
		User_info user_info = (User_info)session.getAttribute(Constants.User_info_session);
		Admin_info admin_info = (Admin_info)session.getAttribute(Constants.Admin_info_session);
		
		if(null != user_info){ //dev SUCCESS
			return true;
		}else if(null != admin_info){ //backend SUCCESS
			return true;
		}else{
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			return false;
		}
		
	}
}
